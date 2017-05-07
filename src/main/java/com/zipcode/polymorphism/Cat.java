package com.zipcode.polymorphism;

/**
 * Created by vidyachandasekhar on 5/4/17.
 */
public class Cat extends Pet {

    public Cat(String name){
        super(name);
        this.setName(name);
        this.setType("Cat");
    }
    @Override
    public String speak() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Meow\n");
        stringBuffer.append("Meeoww\n");
        stringBuffer.append("Meeeow\n");

        return stringBuffer.toString();
    }

}
