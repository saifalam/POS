/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Connection.DBconnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Kaiser
 */
public class MakeOrder {
    public boolean Sendorder(String productId,int quantity ,int supplierId,String delivaryDate) throws SQLException{
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("INSERT into orders (p_id,quantity,o_date,s_id,d_date) values(?,?,?,?,?);");
        pst.setString(1, productId);
        pst.setInt(2, quantity);
        pst.setString(3, dateFormat.format(date));
        pst.setInt(4, supplierId);
        pst.setString(5, delivaryDate);
        pst.execute();
        aDBconnection.CloseConnetion();
        return true;
    }
}
