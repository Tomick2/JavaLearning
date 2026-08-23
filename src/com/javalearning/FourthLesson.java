package com.javalearning;

import java.util.Scanner;

public class FourthLesson {
    public static void main(String[] args) {
        // <, >, <=, >=, ==, !=, ||, &&
        int a = 15, b = 15;
        boolean isHasCar = false;

        if (a != b) {
            System.out.println("It's right!");
        } else if (!isHasCar) {
            System.out.println("It's right!");
        }


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter an arithmetic operator: ");
        String aOperator = scan.nextLine();
        aOperator = scan.nextLine();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        int res;

        switch (aOperator) {
            case "+":
                res = num1 + num2;
                System.out.println("Result: " + res);
            break;
            case "-":
                res = num1 - num2;
                System.out.println("Result: " + res);
            break;
            case "*":
                res = num1 * num2;
                System.out.println("Result: " + res);
            break;
            case "/":
                res = num1 / num2;
                System.out.println("Result: " + res);
            break;

            default: System.out.println(num1 + num2);
        }
    }
}
