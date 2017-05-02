package com.zipcode;
// Then create a SuperHuman class that
// subclasses the first with fields for good or bad, hero name, super ability. As before, create methods for
// retrieving field data and printing to screen.

/**
 * Created by vidyachandasekhar on 5/1/17.
 */
public class SuperHuman extends Human {
    private String characterType;
    private String superAbility;

    @Override
    public void printToConsole() {
        super.printToConsole();
        System.out.println("characterType : " + getCharacterType());
        System.out.println("superAbility : " + getSuperAbility());

    }

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String charecterType) {
        this.characterType = charecterType;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }


}
