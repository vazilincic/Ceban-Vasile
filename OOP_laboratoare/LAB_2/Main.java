package com.company;
public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(40);
        Box box3 = new Box(3, 4, 5);
        System.out.println(String.valueOf(box1.getSurface()) + ' ' + String.valueOf(box1.getVolume()));
        System.out.println(String.valueOf(box2.getSurface()) + ' ' + String.valueOf(box2.getVolume()));
        System.out.println(String.valueOf(box3.getSurface()) + ' ' + String.valueOf(box3.getVolume()));
    }
}
