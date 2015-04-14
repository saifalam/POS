/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Kaiser
 */
public class CurrentUser {
    private String userId;
    private String employeeName;
    private String designation;
    private String address;
    private String contact;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setUserId(String employeeId) {
        this.userId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    
    

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getDesignation() {
        return designation;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    
    
}
