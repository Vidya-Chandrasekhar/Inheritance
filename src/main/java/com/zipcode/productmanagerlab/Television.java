package com.zipcode.productmanagerlab;

/**
 * Created by vidyachandasekhar on 5/4/17.
 */

public class Television extends Product {


    private String modelNo;
    private String make;

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Television(String name, Double price, String id, Integer countOnHand) {
        super(name, price, id, countOnHand);

    }
}