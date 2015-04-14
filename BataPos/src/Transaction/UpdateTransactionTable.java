/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction;

import Connection.DBconnection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Kaiser
 */
public class UpdateTransactionTable {
    public void UpdateTrasaction(TransactionList ob) throws SQLException{
        TransactionList aTransactionList =null;
        if(ob!=null){
            aTransactionList = (TransactionList) ob;
        }
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("INSERT into transaction values(?,?,?,?,?,?,?,?);");
        for(Transaction aTransaction:aTransactionList.getTransactionList()){
            pst.setString(1, aTransaction.getTransactionId());
            pst.setString(2, aTransaction.getProductId());
            pst.setString(3, aTransaction.getProductName());
            pst.setInt(4, aTransaction.getQuantity());
            pst.setDouble(5, aTransaction.getPrice());
            pst.setString(6, aTransaction.getSellDate());
            pst.setInt(7, aTransaction.getEmployeeId());
            pst.setString(8, aTransaction.getDiscount());
            pst.addBatch();
        }
        pst.executeBatch();
        aDBconnection.CloseConnetion();
    }
}
