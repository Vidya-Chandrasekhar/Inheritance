package com.zipcode.productmanagerlab;
/*
Create an application which manages an inventory of products.
Create a product class which has a price, id, and quantity on hand.
Then create an inventory class which keeps track of various products and can
sum up the inventory value.

In your main class initialize your manager and populate your inventory
        Demonstrate calling methods on your manager
        Print all output to screen*/
/**
 * Created by vidyachandasekhar on 5/2/17.
 */
public class Manager {

    private String name;
    private String id;
    private Double price;
    private Double countOnHand;


    public static void main(String[] args) {
        DVDPlayer sony1= new DVDPlayer();
        sony1.setName();
        sony1.setId();
        sony1.setPrice();
        sony1.setCountOnHand();
        System.out.println("====");
        Books ipad1= new Books();
        ipad1.setName();
        ipad1.setId();
        ipad1.setPrice();
        ipad1.setCountOnHand();
        System.out.println("====");
        SonyTV tv1= new SonyTV();
        tv1.setName();
        tv1.setId();
        tv1.setPrice();
        tv1.setCountOnHand();

    }

}
