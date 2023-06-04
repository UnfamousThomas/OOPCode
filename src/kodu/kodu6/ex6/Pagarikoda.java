
package kodu.kodu6.ex6;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class Pagarikoda {
    public static void main(String[] args) {
        List<Kook> koogid = loeKoogid("koogid.txt");
        Collections.sort(koogid);
        for (Kook kook : koogid) {
            System.out.println(kook);
        }
    }

    public static List<Kook> loeKoogid(String failiNimi) {
        List<Kook> koogid = new ArrayList<>();
        File fail = new File(failiNimi);
        if(!fail.exists()) throw new RuntimeException("Fail ei eksisteeri.");
        try {
            Scanner scanner = new Scanner(fail, "UTF-8");
            while(scanner.hasNextLine()) {
                List<String> line = Arrays.asList(scanner.nextLine().split("; "));
                String nimi = line.get(0);
                LocalDate date = LocalDate.parse(line.get(1));
                double ruutSentimeetriHind = Double.valueOf(line.get(2));
                int mitu = line.size()-3;
                if(mitu == 1) {
                    double läbiMõõt = Double.valueOf(line.get(3));
                    Kook kook = new ÜmmarguneKook(nimi,date,ruutSentimeetriHind, läbiMõõt);
                    koogid.add(kook);
                }
                if(mitu == 2) {
                    double laius = Double.valueOf(line.get(3));
                    double pikkus = Double.valueOf(line.get(4));
                    Kook kook = new RistkülikukujulineKook(nimi,date,ruutSentimeetriHind, laius, pikkus);
                    koogid.add(kook);
                }
                if(mitu == 3) {
                    double külgA = Double.valueOf(line.get(3));
                    double külgB = Double.valueOf(line.get(4));
                    double külgC = Double.valueOf(line.get(5));
                    Kook kook = new KolmnurkneKook(nimi,date,ruutSentimeetriHind, külgA,külgB,külgC);
                    koogid.add(kook);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return koogid;
    }
}
