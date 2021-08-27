package com.cseAriful;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class MoviesReader {
    public static String GetTitle() {
        String[] str = new String[10000];
        int randomMovieName = 0, index;
        try {
            File movieFile = new File("movies.txt");
            Scanner keyBoardInput = new Scanner(movieFile);
            index = 0;
            while (keyBoardInput.hasNextLine()) {
                str[index] = keyBoardInput.nextLine();
                index++;
            }
            Random randomInput = new Random();
            randomMovieName = randomInput.nextInt(index);
        } catch (Exception e) {
            System.out.println("File not Found");
        }
        return str[randomMovieName];
    }

}
