/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Connection.DBconnection;
import Transaction.Transaction;
import Transaction.TransactionList;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kaiser
 */
public class TransactionTable {
    public TransactionList getTransactionList() throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Select * From Transaction;");
        ResultSet rs = pst.executeQuery();
        TransactionList aTransactionList= new TransactionList();
        while(rs.next()){
            Transaction aTransaction =new Transaction();
            aTransaction.setTransactionId(rs.getString("t_id"));
            aTransaction.setProductId(rs.getString("p_id"));
            aTransaction.setProductName(rs.getString("p_name"));
            aTransaction.setQuantity(rs.getInt("quantity"));
            aTransaction.setPrice(rs.getDouble("price"));
            aTransaction.setSellDate(rs.getString("sell_date"));
            aTransaction.setEmployeeId(rs.getInt("emp_id"));
            aTransactionList.getTransactionList().add(aTransaction);
        }
        return aTransactionList;
    }
}
