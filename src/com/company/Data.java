package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Data {
    public static char[][] prectiLevel(int cislo) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("lvl"+cislo+".txt"));
            String nextLine = br.readLine();
            String content = "";
            while(nextLine != null) {
                content += nextLine+"\n";
                nextLine = br.readLine();
            }
            String[] pole1 = content.split("\n");
            char[][] pole2 = new char[pole1.length][pole1[0].length()];
            for (int i = 0; i < pole1.length; i++) {
                pole2[i] = pole1[i].toCharArray();
            }
            br.close();
            return pole2;
        }catch (IOException e) {
            System.out.println(e);
        }
        return new char[0][0];
    }
}
