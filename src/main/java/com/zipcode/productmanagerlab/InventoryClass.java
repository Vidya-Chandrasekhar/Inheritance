package com.zipcode.productmanagerlab;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vidyachandasekhar on 5/4/17.
 */
public class InventoryClass {
    // using map for efficient  access and retrieval using Product ID(key) product Instance(Value))
    private Map<String, Product> itemStore = new HashMap<String, Product>();

    public void addItem(Product product) {
        if (itemStore.containsKey(product.getId())) {
            Product existingProduct = itemStore.get(product.getId());
            int newCount = existingProduct.getCountOnHand() + product.getCountOnHand();
            existingProduct.setCountOnHand(newCount);
            itemStore.put(existingProduct.getId(), existingProduct);
        } else {
            itemStore.put(product.getId(), product);
        }
    }

    public void removeItem(Product product) {
        itemStore.remove(product.getId());
    }

    public Integer getItemCount(String id) {
        Product existingProduct = itemStore.get(id);
        if (existingProduct != null) {
            return existingProduct.getCountOnHand();
        } else {
            return null;
        }
    }

    public String getInventoryReport() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Product p1 : itemStore.values()) {
            stringBuilder.append(" id: " + p1.getId() + " name: " + p1.getName() + " qty: " + p1.getCountOnHand() + "\n");
        }
        return stringBuilder.toString();
    }

}
