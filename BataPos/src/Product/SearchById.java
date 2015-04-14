/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import Connection.DBconnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ChoiceFormat;
import java.text.NumberFormat;

/**
 *
 * @author Kaiser
 */
public class SearchById {

    private String productId;
    private String productSize;

    public SearchById(String productId, String productSize) {
        this.productId = productId;
        this.productSize = productSize;
    }

    public String GetSearch() throws SQLException {
        StringBuilder sb = new StringBuilder();
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Select p.p_id,p.p_name,p.p_cat,p.price,i.quantity  from product as p,inventory as i where p.p_id=? and   p.p_id=i.p_id;");
        productId = productId + productSize;
        pst.setString(1, productId);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            String s = rs.getString("p_id");
            String id = s.substring(0, 2);
            String size = s.substring(2);
            sb.append("product Id : ").append(id);
            sb.append("\n");
             sb.append("product Size : ").append(size);
            sb.append("\n");
            sb.append("Product Name : ").append(rs.getString("p_name"));
            sb.append("\n");
            sb.append("Product Category : ").append(rs.getString("p_cat"));
            sb.append("\n");
            sb.append("Price : ").append(NumberFormat.getInstance().format(rs.getInt("price"))).append(" ").append("tk.");
            sb.append("\n");
            sb.append("Quantity : ").append(rs.getInt("quantity")).append(" pairs");
        }
        aDBconnection.CloseConnetion();
        return sb.toString();
    }
}
