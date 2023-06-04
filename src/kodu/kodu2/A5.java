package kodu.kodu2;

public class A5 {
    public static void main(String[] args) {
        int[] vaiksedLapsed = geneeriLastePikkused(10, 60, 100); //väiksed lapsed
        int[] keskmisedLapsed = geneeriLastePikkused(15, 101, 140); //keskmised lapsed
        int[] suuredLapsed = geneeriLastePikkused(20, 141, 200); //suured lapsed
        int[] koikLapsed = new int[45];
        int i = 0;
        System.out.println("Väikesed lapsed:");
        for (int pikkus : vaiksedLapsed) {
            System.out.println(pikkus);
            koikLapsed[i] = pikkus;
            i = i + 1;
        }

        System.out.println("Keskmised lapsed:");
        for (int pikkus : keskmisedLapsed) {
            koikLapsed[i] = pikkus;
            i = i +1;
            System.out.println(pikkus);
        }

        System.out.println("Suured lapsed:");
        for (int pikkus : suuredLapsed) {
            koikLapsed[i] = pikkus;
            i = i +1;
            System.out.println(pikkus);
        }

        System.out.println("VÄGA suured väikesed lapsed:");
        for (int pikkus : vaiksedLapsed) {
            if(pikkus > 80) {
                System.out.println(pikkus);
            }
        }

        System.out.println("Harmooniline keskmine: " + arvutaHarmoonik(koikLapsed));
    }

    private static int[] geneeriLastePikkused(int lasteArv, int pikkusMin, int pikkusMax) {
        int i = 0;
        int[] lapsed = new int[lasteArv];
        while((i + 1) <= lasteArv) {
            int pikkus = genereeriNumber(pikkusMin, pikkusMax);
            lapsed[i] = pikkus;
            i = i +1;
        }

        return lapsed;
    }

    //Allikas // Inspiratsioon: https://www.educative.io/answers/how-to-use-the-mathrandom-method-in-java
    private static int genereeriNumber(int miinimum, int maksimum){
        int ala = maksimum - miinimum + 1;
        return (int)(Math.random() * ala)
                + miinimum;
    }

    //Harmoonilise keskmise arvutamiseks võetud inspiratsiooni/koodi siit: https://ryanharrison.co.uk/2013/10/04/java-calculate-the-harmonic-mean.html

    private static double arvutaHarmoonik(int[] arvud) {
        double summa = 0.0;
        for(int i = 0; i < arvud.length; i++) {
            summa += 1.0 / arvud[i];
        }
        return arvud.length / summa;
    }
}