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
public class SalesmanList {
    List<Salesman> salesmanList = new ArrayList<Salesman>();

    public List<Salesman> getSalesmanList() {
        return salesmanList;
    }

    public void setSalesmanList(List<Salesman> salesmanList) {
        this.salesmanList = salesmanList;
    }
    
}
