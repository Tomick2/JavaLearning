package com.javalearning;

public class FifthLesson {
    public static void main(String[] args) {
        System.out.println("\nFor's work:\n");

        for(float i = 5; i < 25; i += 2) {
            if(i % 3 == 0) {
                continue;
            }
            if(i >= 17) {
                break;
            }
            System.out.println("Number: " + i);
        }

        System.out.println("\nWhile's work:\n");

        short i = 100;
        while(i >= 0) {
            System.out.println("Number: " + i);
            i -= 25;
        }

        System.out.println("\nDoWhile's work:\n");

        short b = 100;
        do {
            System.out.println("Number: " + b);
            b *= 100;
        } while(b < 10);
    }
}
