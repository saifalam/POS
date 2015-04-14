/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaction;

import Connection.DBconnection;
import Product.Product;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kaiser
 */
public class SelectProduct {
    private String productId;
    private String productSize;
    private String quantity;
    private String discount;
    private String salesmanId;
 
    public SelectProduct(String productId, String productSize, String quantity, String discount,String salesmanId) {
        this.productId = productId;
        this.productSize = productSize;
        this.quantity = quantity;
        this.discount = discount;
        this.salesmanId = salesmanId;
    }

   
    
    public void GetSelectedProduct(CartList ob) throws SQLException{
        CartList aCartList=null;
        if(ob!=null){
            aCartList=(CartList)ob;
        }
        DBconnection aDBconnection = new DBconnection();
        PreparedStatement pst = (PreparedStatement) aDBconnection.GetConnection().prepareStatement("Select p.p_id,p.p_name,p.p_cat,p.price,i.quantity  from product as p,inventory as i where p.p_id=? and   p.p_id=i.p_id;");
        productId = productId + productSize;
        pst.setString(1, productId);
        ResultSet rs = pst.executeQuery();
        
        while (rs.next()) {
            String s = rs.getString("p_id");
            String id = s.substring(0, 2);
            String size = s.substring(2);
            Cart aCart =new Cart();
            aCart.setProductId(id);
            aCart.setProductName(rs.getString("p_name"));
            aCart.setProductSize(size);
            aCart.setQuantity(Integer.valueOf(quantity));
            int price = rs.getInt("price")*(Integer.valueOf(quantity));
            if(discount.equals("0")){
                aCart.setPrice(price);
            }
            else{
                double discountPrice =price-((Integer.valueOf(discount)*price)/100);
                aCart.setPrice(discountPrice);
            }
           aCart.setSalesmanId(Integer.valueOf(salesmanId));
           aCart.setDiscount(discount);
           aCartList.getCartList().add(aCart);
           
        }
        aDBconnection.CloseConnetion();
     
    }

}
