/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kaiser
 */
public class EmployeeList {
    List<Employee> employeeList = new ArrayList<Employee>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
}
