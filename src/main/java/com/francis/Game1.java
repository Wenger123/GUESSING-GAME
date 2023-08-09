//package com.francis;
//
//import java.util.Scanner;
//
//class Game1 {
//    boolean hasWon = false;
//    int k = 1;
//    Scanner input = new Scanner(System.in);
//    public void niceGame1() {
//        for (int i = 10; true; ) {
//            int randomNumber = (int) (Math.random() * 100) +1;
//            for (int j = i; j > 0; j--) {
//                System.out.println("You have " + j + " times to guess" + "\nENTER NUMBER: ");
//                int number = input.nextInt();
//                if (randomNumber > number) {
//                    System.out.println("Number is greater than " +number+ " guess again.");
//                } else if (randomNumber < number) {
//                    System.out.println("Number is less than " +number+" guess again.");
//                } else {
//                    hasWon = true;
//                    break;
//                }
//            }
//            if (hasWon) {
//                System.out.println("You won congratulations!!! you finished level " + k);
//                System.out.println("Do you want to play again? YES/NO ");
//                String answer = input.next().toLowerCase();
//                if (answer.equals("yes")){
//                    i = i-2;
//                    k = k+1;
//                    System.out.println("Welcome to level "+k+" Good luck!! ");
//                }else {
//                    break;
//                }
//
//            } else {
//                System.out.println("You lost the game. " + randomNumber + " is the correct number");
//                break;
//            }
//        }
//    }
//}
