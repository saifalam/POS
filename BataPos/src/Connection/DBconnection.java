/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kaiser
 */
public class DBconnection {
    Connection conn = null;
    public Connection GetConnection() throws SQLException{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bata", "root", "123456");
        return conn;
    }
    public void  CloseConnetion() throws SQLException{
    conn.close();
}
}
