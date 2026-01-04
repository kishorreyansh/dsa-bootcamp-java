package com.kishor.abstractdemo;

public abstract class Parent {
    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 3;
    }

    abstract void career();
    abstract void domain();

    void normal(){
        System.out.println("I am a Normal Method");
    }

    static void staticmethod(){
        System.out.println("Iam static method");
    }
}
