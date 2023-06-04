package praks.praks4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TaaraTest {
    public static final double tagatisA = 0.04;
    public static final double tagatisB = 0.08;
    public static final double tagatisC = 0.08;
    public static final double tagatisD = 0.08;

    public static void main(String[] args) {
        ArrayList<String> limonaadideNimed = new ArrayList<>();
        ArrayList<String> joojateNimed = new ArrayList<>();
        ArrayList<Character> pakendiTähised = new ArrayList<>();

        loeAndmed(
                "taara.txt",
                limonaadideNimed,
                pakendiTähised,
                joojateNimed
        );

        int esimeneMasiiv = 0;
        int teineMasiiv = 0;
        int kolmasMasiiv = 0;

        double jagatud = limonaadideNimed.size() / 3;

        esimeneMasiiv = (int) Math.floor(jagatud);
        teineMasiiv = esimeneMasiiv;
        kolmasMasiiv = limonaadideNimed.size() - 2*esimeneMasiiv;

        Taara[] taara1 = new Taara[esimeneMasiiv];
        Taara[] taara2 = new Taara[teineMasiiv];
        Taara[] taara3 = new Taara[kolmasMasiiv];

        for (int i = 0; i < limonaadideNimed.size(); i++) {
            if(i+1 <= esimeneMasiiv) {
                taara1[i] = new Taara(limonaadideNimed.get(i),pakendiTähised.get(i),joojateNimed.get(i));
            }
            else if(i + 1 <= teineMasiiv) {
                //taara2[i - esimeneMasiiv]
            }
        }

    }

    private static void loeAndmed(String failiNimi, ArrayList<String> limonaadid, ArrayList<Character> tähised, ArrayList<String> joojateNimed) {
        File fail = new File(failiNimi);
        try {
            Scanner sc = new Scanner(fail, "UTF-8");
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] andmed = rida.split(" ");
                String nimi = andmed[andmed.length - 1];
                char tüüp = andmed[andmed.length - 2].charAt(0);
                StringBuilder jooginimi = new StringBuilder();
                for (int i = 0; i < andmed.length - 2; i++) {
                    jooginimi.append(andmed[i]);
                }

                limonaadid.add(jooginimi.toString());
                tähised.add(tüüp);
                joojateNimed.add(nimi);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
