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

        Book book1= new Book("Harry Porter", 70.00, "HP08",10 );
        DVDPlayer player1= new DVDPlayer("player1",200.00,"D101",23);
        Television sony1= new Television("Sony1",1900.00,"tvs123",16);

        InventoryClass  inventoryClass=new InventoryClass();

        inventoryClass.addItem(book1);
        inventoryClass.addItem(player1);
        inventoryClass.addItem(sony1);

        String inventoryReport =  inventoryClass.getInventoryReport();
        System.out.println(inventoryReport);
    }

}
