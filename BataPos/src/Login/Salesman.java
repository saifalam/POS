/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Kaiser
 */
public class Salesman extends Employee {
    private int target;
    private int achieve;

    public Salesman(int target, int achieve, int employeeId, String employeeName, String designation, String address, String contact) {
        super(employeeId, employeeName, designation, address, contact);
        this.target = target;
        this.achieve = achieve;
    }
    

 

    /**
     * @return the target
     */
    public int getTarget() {
        return target;
    }

    /**
     * @return the achieve
     */
    public int getAchieve() {
        return achieve;
    }

    
}
