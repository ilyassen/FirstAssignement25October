package com.M3Academy;

import java.util.Scanner;

public class HealthyHearts {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int age;
    int maxHeartRate;
    System.out.println("What is your age in numbers? ");
    age = Integer.parseInt(scanner.nextLine());
    maxHeartRate = 220- age;
    System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
    System.out.println("Your target HR Zone is " + (int) Math.round(maxHeartRate*0.5) + " - " + (int) Math.round(maxHeartRate*0.85) + "  beats per minute");



  }
}
