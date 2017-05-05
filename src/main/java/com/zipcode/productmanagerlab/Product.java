package com.zipcode.productmanagerlab;
//Create a product class which has a price, id, and quantity on hand.

/**
 * Created by vidyachandasekhar on 5/2/17.
 */
public class Product {


    private String name;
    private double price;
    private String id;
    private int countOnHand;


    public Product(String name, Double price, String id, Integer countOnHand) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.countOnHand = countOnHand;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCountOnHand() {
        return countOnHand;
    }

    public void setCountOnHand(Integer countOnHand) {
        this.countOnHand = countOnHand;
    }
}






