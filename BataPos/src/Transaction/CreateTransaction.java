/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Kaiser
 */
public class CreateTransaction {
    private double total;
    private double given;
    private double returned;
    public  String transactionId;
    public int employeeId;
    
    public CreateTransaction(double total,double given,double returned){
        this.total = total;
        this.given=given;
        this.returned=returned;
        
    }
    
    TransactionList aTransactionList =new TransactionList();
    LastTransaction aLastTransaction = new LastTransaction();    
    UpdateInventory aUpdateInventory =new UpdateInventory();
    UpdateAcievement aUpdateAcievement = new UpdateAcievement();
    public void MakeTransaction(CartList ob) throws SQLException, IOException{
        transactionId=aLastTransaction.getlastTransaction();
        CartList aCartList=null;
        if(ob!=null){
            aCartList=(CartList)ob;
        }
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        BufferedWriter out = new BufferedWriter(new FileWriter(transactionId+".txt"));
        out.write("Transaction No : ");
        out.write(transactionId+"\t"+"Date : "+dateFormat.format(date));
        out.newLine();
        out.write("--------------------------------------------------------------");
        out.newLine();
        out.write("Product name"+"\t"+"Quantity"+"\t"+"Price"+"\t\t"+"discount");
        out.newLine();
        out.write("--------------------------------------------------------------");
        out.newLine();
       
        for(Cart aCart : aCartList.getCartList()){
            Transaction aTransaction = new Transaction();
            aTransaction.setTransactionId(transactionId);
            String productId=aCart.getProductId()+aCart.getProductSize();
            aTransaction.setProductId(productId);
            aTransaction.setProductName(aCart.getProductName());
            out.write(aCart.getProductName()+"\t");
            aTransaction.setQuantity(aCart.getQuantity());
            aUpdateInventory.UpdateQuantity(productId, aCart.getQuantity());
            out.write(aCart.getQuantity()+"\t\t");
            aTransaction.setPrice(aCart.getPrice());
            out.write(NumberFormat.getInstance().format(aCart.getPrice())+" Tk."+"\t");
            aTransaction.setDiscount(aCart.getDiscount());
            out.write(aCart.getDiscount()+" %");
            out.newLine();
            aTransaction.setSellDate(dateFormat.format(date));
            aTransaction.setEmployeeId(aCart.getSalesmanId());
            employeeId=aCart.getSalesmanId();
            aTransactionList.getTransactionList().add(aTransaction);
        }
        aUpdateAcievement.UpdateAchievement(employeeId, total);
        out.write("--------------------------------------------------------------");
        out.newLine();
        out.write("Total :"+"\t\t\t\t"+NumberFormat.getInstance().format(total)+" Tk.");
        out.newLine();
        out.write("Given :"+"\t\t\t\t"+NumberFormat.getInstance().format(given)+" Tk.");
        out.newLine();
        out.write("Returned :"+"\t\t\t"+NumberFormat.getInstance().format(returned)+" Tk.");
        out.close();
        UpdateTransactionTable aUpdateTransactionTable =new UpdateTransactionTable();
        aUpdateTransactionTable.UpdateTrasaction(aTransactionList);
    }
   
}
     
