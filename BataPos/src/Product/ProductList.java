/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kaiser
 */
public class ProductList {

    List<Product> productList = new ArrayList<Product>();

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
