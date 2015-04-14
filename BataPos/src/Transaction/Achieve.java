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
public class Achieve {
    public int GetAchieve(int employeeId) throws SQLException{
        int getAchieve = 0;
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Select achieve from salesman where emp_id=?;");
        pst.setInt(1, employeeId);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
         getAchieve=rs.getInt("achieve");
        }
        aDBconnection.CloseConnetion();
        return getAchieve;
    
    }
}
