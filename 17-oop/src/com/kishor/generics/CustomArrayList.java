package com.kishor.generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];
        for(int i=0; i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList ca = new CustomArrayList();
        /*ca.add(17);
        ca.add(23);
        System.out.println("Custom Array List: "+ca);*/

        for(int i=0; i< 17; i++){
            ca.add(2 * i);
        }
        System.out.println("New Custom Array List: "+ca);


    }
}
