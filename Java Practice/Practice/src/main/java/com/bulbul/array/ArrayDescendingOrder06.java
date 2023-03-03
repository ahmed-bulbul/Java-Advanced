package com.bulbul.array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDescendingOrder06 {

    public static void main(String[] args) {
        Integer[] numbers = {4,3,5,7,10,2};
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));
    }
}
