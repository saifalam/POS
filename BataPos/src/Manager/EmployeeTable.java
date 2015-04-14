/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Connection.DBconnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kaiser
 */
public class EmployeeTable {
    EmployeeList ob;
    public void GetEmployeeTable() throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Select * From employee;");
        ResultSet rs = pst.executeQuery();
        EmployeeList aEmployeeList = new EmployeeList();
        while(rs.next()){
            Employee aEmployee = new Employee();
            aEmployee.setEmployeeid(rs.getInt("emp_id"));
            aEmployee.setEmployeeName(rs.getString("emp_name"));
            aEmployee.setDesignation(rs.getString("designation"));
            aEmployee.setAddress(rs.getString("emp_address"));
            aEmployee.setContact(rs.getString("emp_contact"));
            aEmployee.setEmail(rs.getString("email"));
            aEmployeeList.getEmployeeList().add(aEmployee);
        }
        aDBconnection.CloseConnetion();
        ob=aEmployeeList;
    }
    public EmployeeList GetEmployeelist(){
        return ob;
    }
            
}
