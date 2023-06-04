package kodu.kodu6.ex5;

import java.util.Random;

public class AutodeParandamine {
    public static void main(String[] args) {
        Auto auto = new Auto("Peeter", "BMW", false);
        Veoauto veoAuto = new Veoauto("Madis", "Volkswaen", true,false);
        Luksusauto luksusauto = new Luksusauto("Thomas", "Lexus", true, 2023);
        Limusiin limusiin = new Limusiin("Karl", "BMW", false, 2000);

//        Autoteenindus autoteenindus = new Autoteenindus();
//        parandaAuto(auto, autoteenindus);
//        parandaAuto(veoAuto, autoteenindus);
//        parandaAuto(luksusauto, autoteenindus);
//        parandaAuto(limusiin, autoteenindus);
        System.out.println(luksusauto.arvutaParanduseMaksumus(1.0));


    }

    private static void parandaAuto(Auto auto, Autoteenindus autoteenindus) {
        Random random = new Random();
        int arv = random.nextInt(1,21);
        double arvD = arv/2.0;
        autoteenindus.paranda(auto, arvD);
    }
}
