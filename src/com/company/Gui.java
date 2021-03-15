package com.company;

import java.util.Scanner;

public class Gui {
    public static void vyresLevel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej číslo levelu k vyřešení: ");
        char[][] maze = Logic.reseni(Integer.parseInt(sc.nextLine()));
        vypisLevel(maze);
    }

    public static void vypisLevel(char[][] maze) {
        for (char[] chars : maze) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
}
