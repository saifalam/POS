/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Connection.DBconnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;

/**
 *
 * @author Kaiser
 */
public class ProductInfoTable {
    ProductList ob;
    public void GetProductInfoTable() throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Select p.p_id,p.p_name,p.p_cat,i.quantity,p.price from product as p ,inventory as i where p.p_id=i.p_id;");
        ResultSet rs = pst.executeQuery();
        ProductList aProductList = new ProductList();
        while(rs.next()){
            Product aProduct = new Product();
            String s = rs.getString("p_id");
            String id = s.substring(0, 2);
            String size = s.substring(2);
            aProduct.setProductId(id);
            aProduct.setProductSize(size);
            aProduct.setProductName(rs.getString("p_name"));
            aProduct.setProductCategory(rs.getString("p_cat"));
            aProduct.setQuantity(rs.getInt("quantity"));
            aProduct.setPrice(rs.getDouble("price"));
            aProductList.getProductlist().add(aProduct);
            
        }
        aDBconnection.CloseConnetion();
        ob=aProductList;
    }
    public ProductList GetProductList(){
        return ob;
    }
}
