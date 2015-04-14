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
public class SalesmanTable {
    SalesmanList ob;
    public void GetSalesmanTable() throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Select * From salesman;");
        ResultSet rs = pst.executeQuery();
        SalesmanList aSalesmanList = new SalesmanList();
        while(rs.next()){
            Salesman aSalesman=new Salesman();
            aSalesman.setEmployeeId(rs.getInt("emp_id"));
            aSalesman.setTarget(rs.getDouble("target"));
            aSalesman.setAchieve(rs.getInt("achieve"));
            aSalesmanList.getSalesmanList().add(aSalesman);
        }
        aDBconnection.CloseConnetion();
        ob=aSalesmanList;
    }
    public SalesmanList GetSalesmanList(){
        return ob;
    }
}
