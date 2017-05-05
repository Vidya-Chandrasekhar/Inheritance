package com.zipcode.polymorphism;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by vidyachandasekhar on 5/5/17.
 */
public class PetMainTest {
    @Test
    public void getAllPets() throws Exception {
        //given
        PetMain petMain = new PetMain();


        //When
        petMain.addPet("Cat", "Felix");
        petMain.addPet("GuineaPig", "Patches");


        //Then
        String petReport = petMain.getAllPets();
        System.out.println(petReport);
        assertNotNull(petReport);
    }

    @Test
    public void addPet() throws Exception {
    }

}