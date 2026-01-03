package com.assignment4;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean eligible = vote(age);
        if(eligible){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }

    private static boolean vote(int age) {
        boolean ageEligible = false;
        if(age > 18){
            ageEligible = true;
        }
        return ageEligible;
    }
}
