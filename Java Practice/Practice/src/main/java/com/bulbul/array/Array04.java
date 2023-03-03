package com.bulbul.array;

import java.util.Arrays;

public class Array04 {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        int count = 1;

        for(int i=0;i<10;i++){
            numbers[i] = count;
            count = count + 2;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
