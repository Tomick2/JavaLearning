package com.javalearning;

import java.util.ArrayList;

public class SeventhLesson {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
//        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1, 30);

        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        numbers.remove(1);
//        numbers.clear();

        for(Integer element : numbers) {
            System.out.println(element);
        }
    }
}
