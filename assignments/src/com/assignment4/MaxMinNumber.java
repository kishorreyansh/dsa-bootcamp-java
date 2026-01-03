package com.assignment4;

import java.util.Scanner;

public class MaxMinNumber {
    static int maximum(int no1, int no2, int no3){
        int max = no1;
        if(no2 > max){
            max = no2;
        }
        if(no3 > max){
            max = no3;
        }
        return max;
    }
    static int minimum(int no1, int no2, int no3){
        int min = no1;
        if(no2 < min){
            min = no2;
        }
        if(no3 < min){
            min = no3;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int max = maximum(first,second,third);
        System.out.println("Maximum Number: "+max);
        int min = minimum(first,second,third);
        System.out.println("Minimum Number: "+min);
    }
}
