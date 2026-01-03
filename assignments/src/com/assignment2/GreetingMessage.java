package com.assignment2;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name1 = in.nextLine();
        String name = in.next();
        System.out.println("Hello Good Morning "+name);
        System.out.println("Hello Good Evening "+name1);
    }
}
