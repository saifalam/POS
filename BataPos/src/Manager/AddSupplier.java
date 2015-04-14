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
public class AddSupplier {
    public boolean AddNewSupplier(String name,String contact,String email) throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("INSERT into supplier (s_name,s_contact,s_email) values(?,?,?);");
            pst.setString(1, name);
            pst.setString(2, contact);
            pst.setString(3, email);
            pst.execute();
          //  pst.addBatch();
           // pst.executeBatch();
            aDBconnection.CloseConnetion();
            return true;
    }
}
