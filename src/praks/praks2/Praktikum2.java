package praks.praks2;

import java.util.Arrays;

public class Praktikum2 {

    public static void main(String[] args) {
        int[] poistePikkused = {180, 175, 200, 172, 169, 183, 188};
        int[] tudrukPikkused = {165, 167, 172, 169, 162};
        Arrays.sort(poistePikkused);
        Arrays.sort(tudrukPikkused);

        prindiAlgsedAndmed(poistePikkused, tudrukPikkused);

        if(poistePikkused.length == tudrukPikkused.length) {
            vordselt(tudrukPikkused, poistePikkused);
        } else {
            ebavordselt(tudrukPikkused, poistePikkused);
        }
    }

    private static void prindiAlgsedAndmed(int[] poisid, int[] tudrukud) {
        vormistaPrindiAndmed(poisid, "Poiste pikkused:");
        vormistaPrindiAndmed(tudrukud, "Tüdrukute pikkused");
    }
    private static void vormistaPrindiAndmed(int[] andmed, String tüüp) {
        System.out.println(tüüp);
        for (int i : andmed) {
            System.out.print(i + "; ");
        }
        System.out.println();
    }
    
    private static void vordselt(int[] tudrukud, int[] poisid) {
        for (int i : poisid) {
            String valja = "(" + poisid[i] + ", " + tudrukud[i] + ")";
            System.out.print(valja);
        }
    }

    private static void ebavordselt(int[] tudrukud, int[] poisid) {
        boolean poisseOnRohkem = true;
        System.out.println("Tantsupaarid on:");
        if(tudrukud.length > poisid.length) {
            //Poisse pole rohkem, ehk tüdrukuid on
            int mituRohkem = tudrukud.length - poisid.length;

            for (int i = 0; i < tudrukud.length - mituRohkem; i++) {
                System.out.print("(" + tudrukud[i] + ", " + poisid[i] + "); ");
            }
            System.out.println("Paariliseta jäid tüdrukud: ");
            for (int i = tudrukud.length - mituRohkem; i <= tudrukud.length - 1; i++) {
                System.out.print(tudrukud[i] + "; ");
            }
        } else {
            int mituRohkem = poisid.length - tudrukud.length;
            for (int i = 0; i < poisid.length - mituRohkem; i++) {
                System.out.print("(" + tudrukud[i] + ", " + poisid[i] + "); ");
            }
            System.out.println();
            System.out.println("Paariliseta jäid poisid: ");
            for (int i = poisid.length  - mituRohkem; i <= poisid.length - 1; i++) {
                System.out.print(poisid[i] + "; ");
            }

        }


    }
}
