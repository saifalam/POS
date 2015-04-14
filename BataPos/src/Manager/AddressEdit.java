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
public class AddressEdit {
     public boolean updateAddress(String address) throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Update employee Set emp_address=? where emp_id=1;");
        pst.setString(1, address);
        pst.execute();
        aDBconnection.CloseConnetion();
        return true;
    }
}
