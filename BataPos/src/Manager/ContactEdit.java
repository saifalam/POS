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
public class ContactEdit {
    public boolean updateContact(String contact) throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Update employee Set emp_contact=? where emp_id=1;");
        pst.setString(1, contact);
        pst.execute();
        aDBconnection.CloseConnetion();
        return true;
    }
}
