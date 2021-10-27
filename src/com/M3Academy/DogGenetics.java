package com.M3Academy;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

  public static void main(String[] args) {
    String nameDog;

    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your dog's name?");
    nameDog = scanner.nextLine();
    System.out.println("Well then, I have this highly reliable report on " + nameDog +" 's prestigious background right here.");

    System.out.println(nameDog + " is :");

    int min = 0;
    int max = 100;
    int StBernard = 0 , Chihuahua = 0,  dramaticRedNosedAsianPug = 0, commonCur = 0, kingDoberman = 0;
    int i=0;

    do {

      Random randomizer = new Random();
      int random = randomizer.nextInt(max) ;

      switch (i){
        case 0:
          StBernard = random;
          break;
        case 1:
          Chihuahua = random;
          break;
        case 2:
          dramaticRedNosedAsianPug = random;
          break;
        case 3:
          commonCur = random;
          break;
        case 4:
          kingDoberman = max;
          break;
      }
      max = max - random;
      i++;
    } while (i<5);

    System.out.println(StBernard + "% St. Bernard");
    System.out.println(Chihuahua + "% Chihuahua");
    System.out.println(dramaticRedNosedAsianPug + "% Dramatic RedNosed Asian Pug");
    System.out.println(commonCur + "% Common Cur");
    System.out.println(kingDoberman + "% King Doberman");

    System.out.println("Wow, that's QUITE the dog!    ");


  }
}
