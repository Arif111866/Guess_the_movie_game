package com.cseAriful;

import java.util.Scanner;

public class Game {
    public void MainGame() {
        String movieNames = "";
        String moviname;
        String wrongNames = "";
        int wrongInputs = 0;
        int correctInput = 0;
        moviname = MoviesReader.GetTitle();
        Scanner letter = new Scanner(System.in);
        correctInput = Main.Print(moviname, movieNames, wrongNames, 0, wrongInputs);

        while (correctInput != moviname.length() && wrongInputs != 10) {
            System.out.print("Guess a letter:");
            String in = letter.nextLine();
            if (moviname.contains(in)) movieNames = movieNames + in;
            else {
                wrongNames = wrongNames + in;
                wrongInputs++;
            }
            correctInput = Main.Print(moviname, movieNames, wrongNames, 0, wrongInputs);
        }
        if (wrongInputs == 10) {
            System.out.println("\nYou lose!");
        } else {
            System.out.println("You Win!");
            System.out.println("You have guessed  " + moviname + "  correctly.");
        }
    }
}
