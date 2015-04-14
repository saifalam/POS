/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction;

import Connection.DBconnection;
import Login.CurrentUser;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Kaiser
 */
public class UpdateInventory {
      
    public void UpdateQuantity(String productId,int quantity) throws SQLException, IOException{
               
        Quantity aQuantity =new Quantity();
        int quantity1=aQuantity.GetQuantity(productId);
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Update Inventory Set quantity=? where p_id=?;");
        int setQuantity=quantity1-quantity;
        if(setQuantity<5){
            Mail aMail = new Mail();
            aMail.SendMail("aust.saif@gmail.com", "Your Product id :"+productId +"is going to out of stock .");
        }
        pst.setInt(1, setQuantity);
        pst.setString(2, productId);
        pst.execute();
        aDBconnection.CloseConnetion();
    }
}
