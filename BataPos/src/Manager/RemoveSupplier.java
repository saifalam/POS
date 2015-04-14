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
public class RemoveSupplier {
    public boolean SupplierRemove(int id) throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("delete  From supplier where s_id=?;");
            pst.setInt(1, id);
            pst.execute();      
            aDBconnection.CloseConnetion();
            
        return true;
    }
}
