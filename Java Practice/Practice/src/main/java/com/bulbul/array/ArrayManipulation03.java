package com.bulbul.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        //declare two array and initialize first
        int[] firstArray = {1,2,3,4,5,6,7,8,9,10};
        int[] secondArray = new int[firstArray.length];

        for(int i=0;i< firstArray.length;i++){
            secondArray[i]=firstArray[i]+num;
        }

        for(int element:secondArray){
            System.out.print(element+" ");
        }


    }
}
