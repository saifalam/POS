/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kaiser
 */
public class ProductList {
    List<Product> productlist = new ArrayList<Product>();

    public List<Product> getProductlist() {
        return productlist;
    }

    public void setProductlist(List<Product> productlist) {
        this.productlist = productlist;
    }
    
}
