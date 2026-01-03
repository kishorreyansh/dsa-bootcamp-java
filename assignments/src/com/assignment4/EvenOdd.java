package com.assignment4;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        boolean evenodd = evenOdd(no);
        if(evenodd){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }

    }

    private static boolean evenOdd(int no) {
        boolean isEven = false;
        if(no % 2 == 0){
            isEven = true;
        }
        return isEven;
    }
}
