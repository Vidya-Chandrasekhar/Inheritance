package com.zipcode.productmanagerlab;

/**
 * Created by vidyachandasekhar on 5/4/17.
 */
public class DVDPlayer extends Product {


    private String typeHdOrBlueRay;

    public String getTypeHdOrBlueRay() {
        return typeHdOrBlueRay;
    }

    public void setTypeHdOrBlueRay(String typeHdOrBlueRay) {
        this.typeHdOrBlueRay = typeHdOrBlueRay;
    }

    public DVDPlayer(String name, Double price, String id, Integer countOnHand) {
        super(name, price, id, countOnHand);


    }
}




