package kodu.kodu4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Võistlused {

    public static void main(String[] args) {
        File fail = new File("võistlused.txt");
        try {
            Scanner sc = new Scanner(fail, "UTF-8");
            while(sc.hasNextLine()) {
                System.out.println(lühenda(sc.nextLine()));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String lühenda(String failirida) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] soned = failirida.split(" ");
        String aasta = soned[soned.length - 1];
        String viimased2Aasta = aasta.substring(2,4);

        for (int i = 0; i < soned.length-1; i++) {
            stringBuilder.append(soned[i].toUpperCase().charAt(0));
        }

        stringBuilder.append("'");
        stringBuilder.append(viimased2Aasta);

        return stringBuilder.toString();
    }
}
