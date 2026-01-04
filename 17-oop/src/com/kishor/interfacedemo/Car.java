package com.kishor.interfacedemo;

public class Car implements Brake, Engine, Media{
    int a;
    @Override
    public void brake() {
        System.out.println("Iam brake from Brake Interface");
    }

    @Override
    public void start() {
        System.out.println("Iam start from Engine Interface");
    }

    @Override
    public void stop() {
        System.out.println("Iam stop from Engine Interface");
    }

    @Override
    public void acc() {
        System.out.println("Iam acc from Engine Interface");
    }

//    @Override
//    public void start() {
//        System.out.println("Iam start from Media Interface");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("Iam stop from Media Interface");
//    }
}
