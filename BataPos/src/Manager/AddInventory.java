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
public class AddInventory {
    public boolean AddNewInventory(String productId,int quantity) throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("INSERT into inventory(quantity,p_id) values(?,?);");
            pst.setInt(1, quantity);
            pst.setString(2,productId);
            pst.execute();
            aDBconnection.CloseConnetion();
        return true;
    }
}
