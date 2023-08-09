package com.francis;
public class NumberGame {
    public static void main(String[] args) {
        Game game = new Game();

        System.out.println("""
                I have randomly chosen a number between (1 and 100)
                try to guess the number correctly
                Level""" + " " + game.k);

        game.niceGame();

    }
}