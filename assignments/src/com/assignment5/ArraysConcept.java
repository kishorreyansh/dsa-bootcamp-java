package com.assignment5;

import java.util.Arrays;

public class ArraysConcept {
    public static void main(String[] args) {
        int[] rollno = new int[4]; // store the same data type
        rollno[0] = 1;
        rollno[1] = 2;
        rollno[2] = 3;
        //rollno[3] = 3.2; // you cannot store other data type
        System.out.println(Arrays.toString(rollno));

        String[] names = {"Kishor","Reyansh","Ridhansh"};
        //names[3] = "Virat"; // error
        System.out.println(Arrays.toString(names));
    }
}
