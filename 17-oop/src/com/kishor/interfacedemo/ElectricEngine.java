package com.kishor.interfacedemo;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Iam start from Electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("Iam stop from Electric Engine");
    }

    @Override
    public void acc() {
        System.out.println("Iam acc from Electric Engine");
    }
}
