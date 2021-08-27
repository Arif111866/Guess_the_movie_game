package com.cseAriful;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.MainGame();

    }

    public static int Print(String Letter, String names, String wrongs, int c, int wrongInputs) {
        System.out.print("You are guessing:");
        for (int i = 0; i < Letter.length(); i++) {
            if (names.indexOf(Letter.charAt(i)) == -1)
                System.out.print("_");
            else {
                System.out.print(Letter.charAt(i));
                c++;
            }
        }
        System.out.println();
        System.out.print("You have gussed (" + wrongInputs + ") wrong letters:");
        for (int i = 0; i < wrongs.length(); i++) {
            System.out.print(wrongs.charAt(i) + " ");
        }
        System.out.println();
        return c;
    }
}
