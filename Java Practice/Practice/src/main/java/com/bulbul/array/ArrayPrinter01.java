package com.bulbul.array;

import java.util.Arrays;

public class ArrayPrinter01 {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        for(int i=0;i<10;i++){
            numbers[i]=i+1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
