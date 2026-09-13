package com.javalearning;

import java.util.Scanner;

public class SithLesson {
    public static void main(String[] args){
        int[] nums = new int[5];
        nums[0] = 45;
        nums[1] = 23;
        nums[2] = 9;
        nums[3] = 72;
        nums[4] = 2;
        int res = nums[2] + nums[3];

        System.out.println(nums[2]);
        System.out.println(res);

        float[] nums2 = new float[] {5.0f, 6.45f, 89.984f};

        for(int i = 0; i < nums2.length; i++) {
            System.out.println("Element: " + nums2[i]);
        }

        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter number: ");
            int value = scanner.nextInt();
            arr[i] = value;
        }

        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimal: " + min);

        byte[][] numbers = new byte[][] {
            {5, 7},
            {7, 3},
            {2, 0},
        };

        numbers[1][1] = 67;
        System.out.println(numbers[1][1]);
    }
}
