package praks.praks10.ul1.pitsa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class TellimusTest {
    public static void main(String[] args) throws IOException {
        List<Tellimus> tellimused = loeAndmed("tellimused.txt");
        Collections.sort(tellimused);
        for (Tellimus tellimus : tellimused) {
            System.out.println(tellimus.toString());
            try {
                System.out.println(tellimus.maksumus());
            } catch (LiigaPikkOotamiseErind e) {
                System.out.println(tellimus + " võttis liiga kaua. Tasuta.");
            }
        }
    }

    public static List<Tellimus> loeAndmed(String failinimi) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(failinimi));
        String rida = scanner.nextLine();
        List<Tellimus> tellimused = new ArrayList<>();
        while(rida != null) {
            String[] splititud = rida.split(";");
            String nimi = splititud[0];
            List<Pitsa> pitsad = new ArrayList<>();
            for (int i = 1; i < splititud.length; i++) {
                String[] pitsaSplit = splititud[i].split("/");
                String pitsaNimi = pitsaSplit[0];
                double pitsaHind = Double.parseDouble(pitsaSplit[1]);
                Pitsa pitsa = new Pitsa(pitsaNimi, pitsaHind);
                pitsad.add(pitsa);
            }
            Random random = new Random();
            Tellimus tellimus = new Tellimus(nimi, pitsad, random.nextInt(10,36));
            tellimused.add(tellimus);
            if(scanner.hasNext()) rida= scanner.nextLine();
            else rida=null;
        }

        return tellimused;
    }
}
