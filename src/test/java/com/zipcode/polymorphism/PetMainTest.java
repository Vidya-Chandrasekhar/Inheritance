package com.zipcode.polymorphism;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vidyachandasekhar on 5/5/17.
 */
public class PetMainTest {
    @Test
    public void getAllPetsForTwoDiffPets() throws Exception {
        //given
        PetMain petMain = new PetMain();


        //When
        petMain.addPet("Cat", "Felix");
        petMain.addPet("GuineaPig", "Patches");


        //Then
        String petReport = petMain.getAllPets();
        System.out.println(petReport);
        String expectedResult = " Pet_Type : Cat Pet_Name : Felix\n" + " Pet_Type : GuineaPig Pet_Name : Patches\n";
        assertEquals(expectedResult, petReport);
    }

    @Test
    public void addPetDuplicatePets() throws Exception {
        //given
        PetMain petMain = new PetMain();


        //When
        petMain.addPet("Cat", "Felix");
        petMain.addPet("Cat", "Poocha");


        //Then
        String petReport = petMain.getAllPets();
        System.out.println(petReport);
        String expectedResult = " Pet_Type : Cat Pet_Name : Felix\n" + " Pet_Type : Cat Pet_Name : Poocha\n";
        assertEquals(expectedResult, petReport);
    }

    @Test
    public void addNoPets() throws Exception {
        //given
        PetMain petMain = new PetMain();


        //When User enters 0 for Number of pets

        //Then
        String petReport = petMain.getAllPets();
        System.out.println(petReport);
        assertEquals("You don't have any pets !", petReport);
    }

}

