/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Connection.DBconnection;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sun.security.util.Password;

/**
 *
 * @author Kaiser
 */
public class Login {

    private String userName;
    private String password;
    private CurrentUser ob;
    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

   

    public String CheckUser() throws SQLException {
        String user = null;
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("select e.emp_id,e.emp_name,e.designation,e.emp_address,e.emp_contact,e.email,u.u_id,u.password  from employee as e,user as u where e.emp_id=u.emp_id and (e.designation='manager' or e.designation='cashier');");
        ResultSet rs = pst.executeQuery();
        UserList aUserList = new UserList();
        while (rs.next()) {
            User aUser = new User(rs.getString("u_id"), rs.getString("password"), rs.getInt("emp_id"), rs.getString("emp_name"), rs.getString("designation"), rs.getString("emp_address"), rs.getString("emp_contact"),rs.getString("email"));
            aUserList.getUserList().add(aUser);
        }
        aDBconnection.CloseConnetion();
        for (User aUser : aUserList.getUserList()) {
            if (userName.equals(aUser.getuId()) && password.equals(aUser.getPassword())) {
                user = aUser.getDesignation();
                CurrentUser aCurrentUser = new CurrentUser();
                aCurrentUser.setUserId(aUser.getuId());
                aCurrentUser.setEmployeeName(aUser.getEmployeeName());
                aCurrentUser.setDesignation(aUser.getDesignation());
                aCurrentUser.setAddress(aUser.getAddress());
                aCurrentUser.setContact(aUser.getContact());
                aCurrentUser.setEmail(aUser.getEmail());
                ob=aCurrentUser;
                break;
            }

        }
        return user;
    }

    public CurrentUser getOb() {
        return ob;
    }
    
    
}
