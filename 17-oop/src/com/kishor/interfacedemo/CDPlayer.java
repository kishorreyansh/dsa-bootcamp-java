package com.kishor.interfacedemo;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("I am start from CD Player");
    }

    @Override
    public void stop() {
        System.out.println("I am stop from CD Player");
    }
}
