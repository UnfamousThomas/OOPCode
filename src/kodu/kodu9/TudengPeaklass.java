package kodu.kodu9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TudengPeaklass {
    public static void main(String[] args) throws Exception{
        List<AineHinne> hinded = loePunktideFail("punktid.txt");
        Tudeng tudeng = new Tudeng("Peeter", hinded);
        System.out.println(tudeng);
        System.out.println("------------");
        tudeng.salvestaBinaarfaili("peeter.dat");
        Tudeng uusTudeng = Tudeng.loeBinaarfailist("peeter.dat");
        System.out.println(uusTudeng);
    }

    public static List<AineHinne> loePunktideFail(String failinimi) throws Exception {
        List<AineHinne> hinded = new ArrayList<>();
        try (InputStream baidid = new FileInputStream(failinimi);
             InputStreamReader tekst = new InputStreamReader(baidid, "UTF-8");
             BufferedReader puhverdatud = new BufferedReader(tekst)) {
            String rida = puhverdatud.readLine();
            while (rida != null) {
                System.out.println(rida);
                String[] reaSplit = rida.split(":");
                String nimi = reaSplit[0];
                String[] numbrid = reaSplit[1].split(",");
                AineHinne aineHinne = new AineHinne(nimi, numbrid);
                hinded.add(aineHinne);
                rida = puhverdatud.readLine(); // loeb järgmise rea. kui ei saa, tagastab nulli
            }
        }
        return hinded;
    }
}
