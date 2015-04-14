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
public class LastTransaction {
    public String id;
    public String getlastTransaction() throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Select t_id From transaction order by sell_date desc limit 1");
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
             id = rs.getString("t_id");
            
      }
        aDBconnection.CloseConnetion();
        String t=id.substring(0, 1);
        System.out.println(t);
        String n=id.substring(1, id.length());
        System.out.println(n);
        n=String.valueOf(Integer.parseInt(n)+1);
        id=t+n;
        return id;
    }
}
