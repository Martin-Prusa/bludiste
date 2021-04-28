package com.company;

import java.util.Scanner;

public class Gui {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static void vyresLevel() {
        char[][] maze = Logic.reseni();
        vypisLevel(maze);
    }

    public static void vypisLevel(char[][] maze) {
        for (char[] chars : maze) {
            for (char aChar : chars) {
                if(aChar == 'x') {
                    System.out.print(ANSI_GREEN+aChar+ANSI_RESET);
                } else {
                    System.out.print(aChar);
                }

            }
            System.out.println();
        }
    }
}
