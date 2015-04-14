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
public class CartList {
    List <Cart> cartList = new ArrayList<Cart>();

    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
    }
    
}
