package com.bulbul.array;

import java.util.Arrays;

public class ArrayPrintRev02 {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int count =0;

        for(int i=10;i>0;i--){
            numbers[count]=i;
            count++;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
