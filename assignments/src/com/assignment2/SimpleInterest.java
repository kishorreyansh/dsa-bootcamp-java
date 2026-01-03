package com.assignment2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float  principle = in.nextFloat();
        float time = in.nextFloat();
        float rate = in.nextFloat();

        float SI = ( principle * time * rate) /100;
        System.out.println("Simple Interest: "+SI);

    }
}
