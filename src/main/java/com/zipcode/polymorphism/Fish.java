package com.zipcode.polymorphism;

/**
 * Created by vidyachandasekhar on 5/4/17.
 */
public class Fish extends Pet {
    public Fish(String name){
        super(name);
        this.setType("Fish");
    }
    public String speak() {
        return null;
    }

}
