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
public class OrderTable {
    OrderList ob =null;
    public void GetOrderTable() throws SQLException{
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Select * From orders");
        ResultSet rs = pst.executeQuery();
        OrderList aOrderList = new OrderList();
        while(rs.next()){
            Order aOrder = new Order();
            aOrder.setOrderId(rs.getInt("o_id"));
            String s = rs.getString("p_id");
            String id = s.substring(0, 2);
            String size = s.substring(2);
            aOrder.setProductId(id);
            aOrder.setProductSize(size);
            aOrder.setQuantity(rs.getInt("quantity"));
            aOrder.setOrderDate(rs.getString("o_date"));
            aOrder.setSupplierId(rs.getInt("s_id"));
            aOrder.setDelivaryDate(rs.getString("d_date"));
            aOrderList.getOrderList().add(aOrder);
        }
        aDBconnection.CloseConnetion();
        ob=aOrderList;
    }
    public OrderList GetOrderlist(){
        return ob;
    }
}
