/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction;

import Connection.DBconnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kaiser
 */
public class Quantity {
    public int GetQuantity(String productId) throws SQLException{
        int getQuantity = 0;
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Select quantity From inventory where p_id=?;");
        pst.setString(1, productId);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
         getQuantity=rs.getInt("quantity");
        }
        aDBconnection.CloseConnetion();
        return getQuantity;
    
    }
}
