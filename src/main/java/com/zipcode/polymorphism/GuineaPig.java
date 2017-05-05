package com.zipcode.polymorphism;

/**
 * Created by vidyachandasekhar on 5/4/17.
 */
public class GuineaPig extends Pet {

    public GuineaPig(String name){
        super(name);
        this.setType("GuineaPig");
        this.setType("GuineaPig");
    }
    public String speak() {

        return "Squeek";
    }

}
