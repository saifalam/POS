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
public class SupplierList {
    List <Supplier> supplierList = new ArrayList<Supplier>();

    public List<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(List<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
    
}
