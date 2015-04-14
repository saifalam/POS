/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Kaiser
 */
public abstract class Employee {
    private int employeeId;
    private String employeeName;
    private String designation;
    private String address;
    private String contact;
    
    public Employee(int employeeId, String employeeName, String designation, String address, String contact) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
        this.address = address;
        this.contact = contact;
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

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    

}
