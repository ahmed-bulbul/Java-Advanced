package com.bulbul.array;



public class ArraySearch07 {

    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int searchNumber = 6;

        boolean found = false;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==searchNumber){
                found=true;
                System.out.println("Found items at index  "+i);
                break;
            }
        }

        if(!found){
            System.out.println("Item not found");
        }


    }
}
