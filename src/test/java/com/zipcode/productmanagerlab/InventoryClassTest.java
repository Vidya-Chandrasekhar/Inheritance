package com.zipcode.productmanagerlab;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vidyachandasekhar on 5/4/17.
 */
public class InventoryClassTest {
    @Test
    public void addItem() throws Exception {
        //Given
        InventoryClass inventoryClass = new InventoryClass();

        Book book1= new Book("Harry Porter", 70.00, "HP08",10 );
        DVDPlayer player1= new DVDPlayer("player1",200.00,"D101",23);

        //when
        inventoryClass.addItem(book1);
        inventoryClass.addItem(player1);

        //then
        assertEquals( new Integer(10), inventoryClass.getItemCount(book1.getId()));
        assertEquals( new Integer(23), inventoryClass.getItemCount(player1.getId()));
    }

    @Test
    public void removeItem() throws Exception {
        InventoryClass inventoryClass = new InventoryClass();

        Television tv1= new Television("Sony TV", 70.00, "TV01",8 );

        DVDPlayer player1= new DVDPlayer("player1",200.00,"D101",23);

        //when
        inventoryClass.addItem(tv1);
        inventoryClass.addItem(player1);
        inventoryClass.removeItem(tv1);

        //then
        assertNull( inventoryClass.getItemCount(tv1.getId()));
    }



    @Test
    public void getInventoryReport() throws Exception {


        InventoryClass inventoryClass = new InventoryClass();

        Television tv1= new Television("Sony TV", 70.00, "TV01",8 );


        //when
        inventoryClass.addItem(tv1);

        //then
        String exptectedReport =  " id: TV01 name: Sony TV qty: 8\n";
        String  report = inventoryClass.getInventoryReport();
        System.out.println(report);
        assertEquals(report.trim(),exptectedReport.trim());
    }

}