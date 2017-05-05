package com.zipcode.polymorphism;

/**
 * Created by vidyachandasekhar on 5/4/17.
 */
public abstract class Pet {
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    public Pet(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract String speak();


}
