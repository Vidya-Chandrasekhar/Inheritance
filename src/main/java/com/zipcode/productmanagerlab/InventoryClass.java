package com.zipcode.productmanagerlab;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vidyachandasekhar on 5/4/17.
 */
public class InventoryClass {
     List<Product> itemStore =new ArrayList<Product>();

    public void addItem(Product product){
        itemStore.add(product );
    }
    public void removeItem(Product product){
        itemStore.remove(product);
    }
    public void getItemCount(int id){}
    public void addInventory(Product product){}

}
