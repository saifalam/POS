/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Kaiser
 */
public class User extends Employee {
    private String uId;
    private String password;
    private String email;

    public User(String uId, String password, int employeeId, String employeeName, String designation, String address, String contact,String email) {
        super(employeeId, employeeName, designation, address, contact);
        this.uId = uId;
        this.password = password;
        this.email=email;
    }

    public String getPassword() {
        return password;
    }

    public String getuId() {
        return uId;
    }

    public String getEmail() {
        return email;
    }
    
    
}
