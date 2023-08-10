package com.francis;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        final int MONTHS_IN_A_YEAR = 12;
        final int PERCENTAGE = 100;
        int principal = 0;
        float monthlyInterestRate = 0;
        int numberOfPayment = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
             System.out.print("PRINCIPAL: ");
             principal = scanner.nextInt();
             if (principal >= 1000000 && principal <= 10000000)
                 break;
             System.out.println("ENTER A NUMBER BETWEEN 1_000_000 AND 10_000_000.");
        }

        while (true) {
            System.out.print("ANNUAL INTEREST RATE: ");
            float annualInterestRate = scanner.nextFloat();
              if (annualInterestRate >= 0 && annualInterestRate <= 3){
                  monthlyInterestRate = annualInterestRate/PERCENTAGE/MONTHS_IN_A_YEAR;
                  break;
              }
              System.out.println("ENTER A VALUE GREATER THAN 0 AND LESS THAN 3.");
        }
        while (true) {
        System.out.print("PERIOD (YEARS): ");
        byte years = scanner.nextByte();
            if (years >= 0 && years <= 30){
                 numberOfPayment = years*MONTHS_IN_A_YEAR;
                break;
            }
            System.out.println("ENTER A VALUE BETWEEN 1 AND 30.");
        }

        double morGage =principal
                        * monthlyInterestRate*Math.pow(1+monthlyInterestRate,numberOfPayment)
                         / Math.pow(1+monthlyInterestRate,numberOfPayment)-1;
        String myMorGage = NumberFormat.getCurrencyInstance().format(morGage);
        System.out.println(myMorGage);

        scanner.close();



    }
}