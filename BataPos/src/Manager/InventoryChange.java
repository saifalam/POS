/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Connection.DBconnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Kaiser
 */
public class InventoryChange {
    private String inventoryId;
    private String quantity;

    public InventoryChange(String inventoryId, String quantity) {
        this.inventoryId = inventoryId;
        this.quantity = quantity;
    }
    public boolean UpdateInventory() throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("update inventory set quantity=? where i_id=?;");
        pst.setInt(1, Integer.parseInt(quantity));
        pst.setInt(2, Integer.parseInt(inventoryId));
        pst.execute();
        aDBconnection.CloseConnetion();
        return true;
    }
}
