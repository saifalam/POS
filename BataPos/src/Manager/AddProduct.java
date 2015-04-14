/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Connection.DBconnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Kaiser
 */
public class AddProduct {
    public boolean AddnewProduct(String productId,String productName,String productCategory,Double price) throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("INSERT into product values(?,?,?,?);");
            pst.setString(1, productId);
            pst.setString(2, productName);
            pst.setString(3, productCategory);
            pst.setDouble(4, price);
            pst.execute();
            aDBconnection.CloseConnetion();
        return true;
    }
}
