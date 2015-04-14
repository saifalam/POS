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
public class InventoryTable {
    InventoryList ob;
    public void GetInventoryTable() throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Select p.p_id,p.p_name,i.quantity,i.i_id from product as p,inventory as i where p.p_id=i.p_id;");
        ResultSet rs = pst.executeQuery();
        InventoryList aInventoryList = new InventoryList();
        while(rs.next()){
            Inventory aInventory = new Inventory();
            String s = rs.getString("p_id");
            String id = s.substring(0, 2);
            String size = s.substring(2);
            aInventory.setProductId(id);
            aInventory.setProductSize(size);
            aInventory.setProductName(rs.getString("p_name"));
            aInventory.setQuantity(rs.getInt("quantity"));
            aInventory.setInventoryId(rs.getInt("i_id"));
            aInventoryList.getInventoryList().add(aInventory);
        }
        aDBconnection.CloseConnetion();
        ob=aInventoryList;
    }
    public InventoryList GetInventoryList(){
        return ob;
    }
}
