package praks.praks9;

import kodu.kodu9.AineHinne;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InimenePea {
    public static void main(String[] args) throws IOException {
        List<String> algsedLapsed = new ArrayList<>();
        algsedLapsed.add("Peeter");
        algsedLapsed.add("Joonas");
        Inimene inimene = new Inimene("Kati", "Oinas", algsedLapsed);
        System.out.println(inimene);

        DataOutputStream dos = new DataOutputStream(new FileOutputStream("inimesed.txt"));
        dos.writeUTF(inimene.toString());
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("inimesed.txt"));

        while (dis.available() > 0) {
            String kogu = dis.readUTF();
            String[] eraldatud = kogu.split(":");
            String[] eraldatudNimed = eraldatud[0].split(" ");
            String eesnimi = eraldatudNimed[0];
            String perenimi = eraldatudNimed[1];
            String[] lapseNimed = eraldatud[1].split(";");
            List<String> nimed = Arrays.asList(lapseNimed);
            Inimene inimene1 = new Inimene(eesnimi, perenimi, nimed);
            System.out.println(inimene1);
        }
        dis.close();


    }
}
