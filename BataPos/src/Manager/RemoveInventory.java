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
public class RemoveInventory {
     public boolean  RemoveSelectedInventory(String productId) throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Delete From inventory where p_id=?);");
        pst.setString(1, productId);
        pst.execute();
        aDBconnection.CloseConnetion();
        return true;
}
}
