package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter integer values:  ");
        int[] myIntArray = getArray(5);
        printArray(myIntArray);
       int myMin = findMin(myIntArray);
        System.out.println("Minimum value entered by the user was: " + myMin);




    }
    public static int[] getArray (int count){

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a " + i + " number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;

        }
        return array;

    }

    public static void printArray(int[] array){
        for(int i =0; i<array.length; i++){
            System.out.println("Array element: " + i + " Element value: " + array[i]);
        }
    }

    public static int findMin(int[] array){

        int minValue = Integer.MAX_VALUE;
        for(int i =0; i<array.length; i++){
            int temp = array[i];
            if(temp<minValue){
                minValue=temp;
            }
        }
        return minValue;
    }

            }