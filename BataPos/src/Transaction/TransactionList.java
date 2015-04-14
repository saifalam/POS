/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kaiser
 */
public class TransactionList {
    List<Transaction> transactionList= new ArrayList<Transaction>();

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
    
    
}
