package com.M3Academy;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

      int rounds = 0;
      String playAgain = "";
      Scanner scanner = new Scanner(System.in);
      int wins = 0, loses = 0, ties = 0;
        do {

          wins = 0;
          loses = 0;
          ties = 0;
          clearScreen();
        System.out.println("Entrez le nbm de attempts (Between 1 and 10)");
        rounds = Integer.parseInt(scanner.nextLine());
        if (rounds < 1 || rounds > 10){
          System.out.println("Outside of range");
          System.exit(0);
        } ;


        int choix;
        for (int i=1; i<=rounds; i++){
          choix = getChoice();
          Random randomizer = new Random();
          int choixComputer = randomizer.nextInt(2) + 1;

          if( choix == choixComputer) {
//            Entres if there is a tie
            System.out.println("Tie" );
            ties++;
          } else if ((choix == 1 && choixComputer == 3 ) || (choix == 2 && choixComputer == 1 ) || (choix == 3 && choixComputer == 2 ) ){
//            Enters if the user won
            System.out.println(" Win" );
            wins++;
          } else {
//            enters if the user losts
            loses++;
            System.out.println("Loses" );
          }
        }

          System.out.println("Wins :" + wins);
          System.out.println("looses :" + loses);
          System.out.println("Ties :" + ties);

          displayScore(wins, loses);

          do {
            System.out.println("Play Again ? (YES/NO)");
            playAgain = scanner.nextLine();
          }while (!playAgain.equalsIgnoreCase("yes")  && !playAgain.equalsIgnoreCase("no"));

      }while(playAgain.equalsIgnoreCase("yes"));

      System.out.println("Thanks for playing!");
    }


  /**
   * Method to display who is the winner
   * @param wins
   * @param loses
   */
  private static void displayScore(int wins, int loses) {
    if(wins > loses) {
      System.out.println("YOU WIN");
    } else if (wins < loses){
      System.out.println("YOU  LOOSE");
    } else {
      System.out.println("ITS A DRAW");
    }
  }

  /**
   * Method to get  and return the choice of the user
   * @param
   * @return choice
   */
  private static int getChoice() {

    int choice;
    Scanner scanner = new Scanner(System.in);
    do{
      System.out.println("Enter your Choice :");
      System.out.println("1 for Rock");
      System.out.println("2 for Paper");
      System.out.println("3 for Scisors");
      choice = Integer.parseInt(scanner.nextLine());
      if(choice == 1) {
        System.out.println("You choosed ROCK (1)");
      } else if (choice == 2) {
        System.out.println("You choosed Paper (2)");
      } else if (choice == 3) {
        System.out.println("You choosed Scisors (3)");
      } else {
        System.out.println("Wrong Choice ");
      }
    } while (choice < 1  || choice > 3);
    return choice;
  }

  public static void clearScreen() {
    System.out.println(new String(new char[50]).replace("\0", "\r\n"));
  }
}
