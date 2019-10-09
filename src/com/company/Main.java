package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter integer values to: \n" +
                "       1. Create an array \n" +
                "       2. Find minimum number that u entered \n"+
                "       3. Reverse your Array");
        int[] myIntArray = getArray(5);
        printArray(myIntArray);
       int myMin = findMin(myIntArray);
        System.out.println("Minimum value entered by the user was: " + myMin + "\n");
        int[] myReversedArray = reverseArray(myIntArray);

        System.out.println("Reversed Array: " +"\n");
        printArray(myReversedArray);






    }
    private static int[] getArray (int count){

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a " + (i+1) + " number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;

        }
        return array;

    }

    private static void printArray(int[] array){
        for(int i =0; i<array.length; i++){
            System.out.println("Array element: " + i + " Element value: " + array[i]);
        }
    }

    private static int findMin(int[] array){

        int minValue = Integer.MAX_VALUE;
        for(int i =0; i<array.length; i++){
            int temp = array[i];
            if(temp<minValue){
                minValue=temp;
            }
        }
        return minValue;
    }

    private static int[] reverseArray(int [] array){
        int maxIndex = array.length-1;
        int middleIndex = array.length/2;


        for(int i = 0; i<middleIndex; i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex -i] = temp;
        }return array;
    }

            }