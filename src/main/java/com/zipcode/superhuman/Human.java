package com.zipcode.superhuman;
//Create a 'Human' class that has fields for: name, age, gender, occupation, and address.
// Also create methods for retreiving and outputing this data to screen.
//
// Then create a SuperHuman class that
// subclasses the first with fields for good or bad, hero name, super ability. As before, create methods for
// retrieving field data and printing to screen.

/**
 * Created by vidyachandasekhar on 5/1/17.
 */
public class Human {
    private String name;
    private Integer age;
    private String gender;
    private String occupation;
    private String address;

    public static void main(String[] args) {
        Human person = new Human();
        person.setName("ClarkKent");
        person.setAge(27);
        person.setGender("Male");
        person.setOccupation("Student");
        person.setAddress("123,home,city,state");
        person.printToConsole();
        System.out.println("===========================================");
        SuperHuman superHuman = new SuperHuman();
        superHuman.setName("spiderMan");
        superHuman.setAge(27);
        superHuman.setGender("Male");
        superHuman.setOccupation("student");
        superHuman.setAddress("123,spideyln, city, state");
        superHuman.setCharacterType("Hero");
        superHuman.setSuperAbility("Spins webs and saves the world!!!");
        superHuman.printToConsole();
    }

    public void printToConsole() {
        System.out.println("name: " + getName());
        System.out.println("age : " + getAge());
        System.out.println("gender : " + getGender());
        System.out.println("occupation : " + getOccupation());
        System.out.println("address : " + getAddress());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}





