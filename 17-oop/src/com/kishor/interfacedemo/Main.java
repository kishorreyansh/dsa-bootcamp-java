package com.kishor.interfacedemo;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.brake();
        c.start();
        c.stop();
        c.acc();

        Engine car1 = new Car();
        //car1.a;

        Media car2 = new Car();
        car2.start();
        car2.stop();

        System.out.println("Interface Concept to resolve above issue");
        NiceCar nice = new NiceCar();
        nice.start(); //calls Power Engine start
        nice.stop(); // calls Power Engine stop
        nice.upgradeEngine(); // calls Electric Engine object
        nice.start(); // calls Electric Engine start
        nice.stop(); //calls Electric Engine stop
        nice.startMusic(); // calls CD Player start
        nice.stopMusic(); // calls CD Player stop
    }
}
