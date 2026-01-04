package com.kishor.abstractdemo;

public class Main {
    public static void main(String[] args) {
        Son s = new Son(24);
        s.career();
        s.domain();
        s.normal();
        System.out.println(s.age);
        System.out.println("Final Value of Parent Class: "+s.VALUE);

        Daughter d = new Daughter(20);
        d.career();
        d.domain();
        d.normal();
        System.out.println(d.age);

        Parent.staticmethod();
    }
}
