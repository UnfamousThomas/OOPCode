package kt.kt1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Peaklass {
    public static void main(String[] args) {
        List<Lennuk> lennukid = new ArrayList<>();
        try {
            lennukid = loeLennukid("lennukid.txt");
        } catch (Exception e) {
            System.out.println("Midagi läks valesti failist lugemisel. Lõpetan töö.");
            System.exit(1);
        }

        Collections.sort(lennukid);
        for (Lennuk lennuk : lennukid) {
            System.out.println(lennuk);
        }

        Lennujaam lennujaam = new Lennujaam();
        for (Lennuk lennuk : lennukid) {
            lennujaam.lisaLennuk(lennuk);
        }
        Random random = new Random();
        int arv = random.nextInt(0, lennukid.size()); //viimane number pole kaasaarvatud
        for (int i = 0; i < arv; i++) {
            lennujaam.lennukiLahkumine();
        }

        System.out.println(lennujaam);
    }

    public static List<Lennuk> loeLennukid(String failiNimi) throws Exception {
        File file = new File(failiNimi);
        if(!file.exists()) throw new FileNotFoundException("Ei leidnud faili: " + failiNimi);
        List<Lennuk> lennukid = new ArrayList<>();
        Scanner scanner = new Scanner(file, "UTF-8");
        while(scanner.hasNextLine()) {
            String[] rida = scanner.nextLine().split(";");
            String register = rida[0];
            if(rida.length == 2) {
                //Kaubalennuk
                Lennuk lennuk = new Kaubalennuk(register, Double.parseDouble(rida[1]));
                lennukid.add(lennuk);
            }
            if(rida.length == 3) {
                //Reisilennuk
                Lennuk lennuk = new Reisilennuk(register, Integer.parseInt(rida[1]), Integer.parseInt(rida[2]));
                lennukid.add(lennuk);
            }
        }

        return lennukid;
    }
}
