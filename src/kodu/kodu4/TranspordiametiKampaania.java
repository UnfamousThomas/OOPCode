package kodu.kodu4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TranspordiametiKampaania {

    public static void main(String[] args) {
        ArrayList<Kodanik> kodanikud = loeKodanikud("kodanikud.txt");
        ArrayList<Kodanik> kodanikudKesSaid = new ArrayList<>();

        for (Kodanik kodanik : kodanikud) {
            boolean olemas = kodanik.kasJuhilubaOnOlemas();
            boolean kaheksateist = kodanik.kasOnTäiskasvanuAastal2018();

            if(kaheksateist) {
                if(!olemas) {
                    System.out.println(kodanik.toString() + ", " + kodanik.getIsikukood() + " sai juhi loa");
                    kodanikudKesSaid.add(kodanik);
                } else {
                    System.out.println(kodanik.toString() + ", " + kodanik.getIsikukood() + " ei saanud juhi luba, kuna tal on see juba.");

                }
            } else {
                System.out.println(kodanik.toString() + ", " + kodanik.getIsikukood() + " ei saanud juhi luba, kuna ta pole täiskasvanu.");
            }
        }

        System.out.println("Kodanikud kes jäid juhi loast ilma: ");
        kodanikud.removeAll(kodanikudKesSaid);

        for (Kodanik kodanik : kodanikud) {
            System.out.println(kodanik.getIsikukood());
        }
    }

    static ArrayList<Kodanik> loeKodanikud(String failinimi) {
        File fail = new File(failinimi);
        ArrayList<Kodanik> kodanikud = new ArrayList<>();
        try {
            Scanner sc = new Scanner(fail, "UTF-8");
            while(sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] andmed = rida.split(",");
                boolean olemas = false;
                if(andmed[3].equalsIgnoreCase("olemas")) olemas=true;
                Kodanik kodanik = new Kodanik(
                        andmed[1],
                        andmed[0],
                        andmed[2],
                        olemas
                );

                kodanikud.add(kodanik);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return kodanikud;
    }
}
