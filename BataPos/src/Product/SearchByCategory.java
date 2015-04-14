/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import Connection.DBconnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;

/**
 *
 * @author Kaiser
 */
public class SearchByCategory {
    private String category;

    public SearchByCategory(String category) {
        this.category = category;
    }
    public String GetSearch() throws SQLException {
        StringBuilder sb = new StringBuilder();
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Select p.p_id,p.p_name,p.p_cat,p.price,i.quantity  from product as p,inventory as i where p.p_cat=? and   p.p_id=i.p_id;");
        pst.setString(1, category);
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
            sb.append("\n\n");
        }
        aDBconnection.CloseConnetion();
        return sb.toString();
    }
}
