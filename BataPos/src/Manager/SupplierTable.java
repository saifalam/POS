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
public class SupplierTable {
    SupplierList ob;
    public void GetSupplierTable() throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Select * From supplier;");
        ResultSet rs = pst.executeQuery();
        SupplierList aSupplierList =new SupplierList();
        while(rs.next()){
            Supplier aSupplier = new Supplier();
            aSupplier.setSupplierId(rs.getInt("s_id"));
            aSupplier.setSupplierName(rs.getString("s_name"));
            aSupplier.setSupplierContact(rs.getString("s_contact"));
            aSupplier.setSupplierEmail(rs.getString("s_email"));
            aSupplierList.getSupplierList().add(aSupplier);
        }
        aDBconnection.CloseConnetion();
        ob=aSupplierList;
    }
    public SupplierList GetSupplierList(){
        return ob;
    }
}
