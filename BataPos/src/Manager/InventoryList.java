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
public class InventoryList {
    List <Inventory> inventoryList = new ArrayList<Inventory>();

    public List<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }
    
    
}
