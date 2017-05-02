package com.zipcode;

/**
 * Create a class that subclasses the built-in List class. Write a function that rotates a list by k elements.
 * For example [1,2,3,4,5,6] rotated by two becomes [3,4,5,6,1,2]. Try solving this without creating a copy of
 * the list. How many swap or move operations do you need
 */

//In your main class, initialize your custom List with values
//In your main class call the method that rotates your array
// Print original and rotated List values to screen


/**
 * Created by vidyachandasekhar on 5/1/17.
 */

public class MyRotatedArray {

    public static void main(String[] args) {
        int[] myarray = {1, 2, 3, 4, 5, 6};
        int[] out = rotateArray(myarray, 2);
        printArray(out);
    }


    public static int[] rotateArray(int[] inputArray, int rotateByDigits) {
        int[] outputArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            int outArrayPosition = i + rotateByDigits;
            if (outArrayPosition > inputArray.length - 1) {
                outArrayPosition = outArrayPosition - (inputArray.length - 1) - 1;
            }
            outputArray[outArrayPosition] = inputArray[i];

        }
        return outputArray;

    }

    private static void printArray(int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(anArray[i]);
        }
    }
}

