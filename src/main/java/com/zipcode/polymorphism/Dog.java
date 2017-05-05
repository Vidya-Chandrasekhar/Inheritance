package com.zipcode.polymorphism;

/**
 * Created by vidyachandasekhar on 5/4/17.
 */
public class Dog extends Pet {

    public Dog(String name){
        super(name);
        this.setType("Dog");
    }

    public String speak() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Boww\n");
        stringBuffer.append("Wooow\n");
        ;

        return stringBuffer.toString();
    }

}
