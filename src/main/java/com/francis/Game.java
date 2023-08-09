package com.francis;

import java.util.Scanner;

public class Game {
    boolean hasWon = false;
    int k = 1;

    Scanner input = new Scanner(System.in);

    public void niceGame () {
        for (int i = 10; true; ){
            int randomNumber = (int) (Math.random() * 100)+1;
                for (int j = i; j > 0; j--) {
                    System.out.println("You have "+ j +" guesses left. \nENTER NUMBER: ");
                    int number = input.nextInt();

                    if (randomNumber < number){
                        System.out.println("Is less than " + number + " guess again.");
                    } else if (randomNumber > number){
                        System.out.println("Is greater than " + number + " guess again.");
                    } else {
                        hasWon = true;
                        break;
                    }
                }


                if (!hasWon){
                System.out.println("You failed Game over! "+ randomNumber+ " is the correct number");
                break;
                } else {
                    System.out.println("You have won!!! congratulations you finished level " +k);
                    System.out.println("DO YOU want to Continue? YES/NO ");
                    String ans = input.next().toLowerCase();
                    if (ans.equals("yes")) {
                        i  = i - 1;
                        k = k + 1;

                        System.out.println("Welcome to Level "+k+" Good Luck!!!...");
                    } else {
                        break;
                    }
                }
                hasWon = false;
        }
    }
}
