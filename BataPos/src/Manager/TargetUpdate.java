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
public class TargetUpdate {
    public boolean SetNewTarget(int employeeId,double target) throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Update salesman set target=? where emp_id=?;");
        pst.setInt(1, employeeId);
        pst.setDouble(2, target);
        return true;
    }
}
