package com.kishor.interfacedemo;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("I am start from Power Engine");
    }

    @Override
    public void stop() {
        System.out.println("I am stop from Power Engine");
    }

    @Override
    public void acc() {
        System.out.println("I am acc from Power Engine");
    }
}
