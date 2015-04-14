/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction;

import Connection.DBconnection;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Kaiser
 */
public class UpdateAcievement {
    public void UpdateAchievement(int employeeId,double total) throws SQLException, IOException{
               
        Achieve aAchieve =new Achieve();
        double achieve=aAchieve.GetAchieve(employeeId);
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Update salesman Set achieve=? where emp_id=?;");
        double setAchievemnet= achieve+total;
        
        pst.setDouble(1, setAchievemnet);
        pst.setInt(2, employeeId);
        pst.execute();
        aDBconnection.CloseConnetion();
    }
}
