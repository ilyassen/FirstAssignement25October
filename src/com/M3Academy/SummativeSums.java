package com.M3Academy;

import java.util.Arrays;
import java.util.Scanner;

public class SummativeSums {

    public static void main(String[] args) {
      System.out.println("Enter the required size of the array : ");
      Scanner scanner = new Scanner(System.in);
      int size = scanner.nextInt();
      int myArray[] = new int [size];
      int sum = 0;
      System.out.println("Enter the elements of the array one by one ");

      for(int i=0; i<size; i++){
        myArray[i] = scanner.nextInt();
        sum = sum + myArray[i];
      }
      System.out.println("My array is : "+ Arrays.toString(myArray));
      System.out.println("Array sum :"+sum);
    }
}
