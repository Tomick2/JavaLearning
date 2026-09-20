package com.javalearning;

public class EighthLesson {
    public static void main(String[] args) {
        info("Hello");
        String java = "Java";
        info(java);
        info("");

        short num = 7;
        int res = summa((short) 5, num);

        info(String.valueOf(res));

        byte[] nums = new byte[] {5, 6, 7};
        int res2 = summaArray((byte[]) nums);
        info(String.valueOf(res2));
    }

    public static void info(String word) {
        System.out.print(word + "!");
    }

    public static int summa(short a, short b) {
        int res = a + b;
        String result = "Result: " + res;

        info(result);

        return res;
    }

    public static int summaArray(byte[] arr) {
        int summa = 0;
        for(int i = 0; i < arr.length; i++) {
            summa += arr[i];
        }

        return summa;
    }
}
