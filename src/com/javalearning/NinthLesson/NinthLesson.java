package com.javalearning.NinthLesson;

public class NinthLesson {
    public static void main(String[] args) {
        Transport Mercedes = new Transport();

        Mercedes.maxSpeed = 250.5f;
        Mercedes.weight = 1750;
        Mercedes.color = "Green";
        Mercedes.coordinate = new byte[] {0, 0, 0};

        Transport BMW = new Transport();

        BMW.setValues(140.5f, 3700, "Black", new byte[] {100, 0, 100});
        System.out.println(BMW.getValues());
    }
}
