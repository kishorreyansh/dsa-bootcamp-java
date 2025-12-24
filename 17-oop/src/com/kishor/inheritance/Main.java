package com.kishor.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4,5,6);
        Box box1 = new Box(box);  //Copy Constructor
        System.out.println(box.l + " " + box.h + " " +box.w);
        System.out.println(box1.l + " " + box1.h + " " +box1.w);

        BoxWeight box2 = new BoxWeight(2,3,4,5);
        System.out.println(box2.l + " " + box2.h + " " +box2.w + " " +box2.weight);

        Box box3 = new BoxWeight(2,3,4,5);
        System.out.println(box3.w); //box3.weight can be accessed
    }
}
