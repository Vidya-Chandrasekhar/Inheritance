package com.zipcode.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Part 1: Create a program that asks the user how many pets they have. Once you know how many pets they have,
ask them what kind of pet each one is, along with each pet's name. For now your program should just hold
onto the user input and print out the list at the end; we'll modify this in part 3.
Part 2:
Create a Pet class, and a subclass for each type of pet that you want your program to support. Your classes
should follow the following requirements:
You must support at least three types of pets.Dog must be one of the types you support.Cat must be one of the
 types you support.The Pet class must have a speak method that each subclass overrides.The Pet class must have a name field with setters and getters.
 Use the tests provided as examples to write your own tests for other supported types of pets.
 Part 3:
 Modify your program from part 1 to use the Pet class and its subclasses. Keep a list of the pets your user
 lists and at the end of the program print out a list of their names and what they say when they speak.

/**
 * Created by vidyachandasekhar on 5/5/17.
 */
public class PetMain {

    private List<Pet>  petStorage = new ArrayList<Pet>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of pets");
        int numberOfPets = input.nextInt();
        if (numberOfPets == 0){
            System.out.println("No pets exiting");
            return;
        }
        PetMain petMain = new PetMain();


        for (int i=0; i < numberOfPets; i++){
            System.out.println("Enter Type of Pet :");
            String petType = input.next();
            System.out.println("Enter Name of Pet :");
            String petName = input.next();
            petMain.addPet(petType,petName);
        }

        String petsReport = petMain.getAllPets();

        System.out.println(petsReport);

    }

    public String getAllPets(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Pet pet: petStorage){
            stringBuilder.append(" Pet_Type : " + pet.getType() + " Pet_Name : "+ pet.getName() +"\n");
        }
        if(stringBuilder.toString().length()==0){
            return  "You don't have any pets !";
        }
        return stringBuilder.toString();
    }


    public void addPet(String petType, String petName){

        switch (petType) {
            case "Cat":
                petStorage.add(new Cat(petName));
                break;
            case "Dog":
                petStorage.add(new Dog(petName));
                break;
            case "Fish":
                petStorage.add(new Fish(petName));
                break;
            case "GuineaPig":
                petStorage.add(new GuineaPig(petName));
                break;
            default:
                System.out.println("Invalid Pet Type (Valid Pets are Cat|Dog|Fish|Guineapig");
                break;
        }

    }
}
