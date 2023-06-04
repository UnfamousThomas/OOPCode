package kt.kt2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Kiirlaskumine {

    /**
     * Main meetod kust algab programmi töö. Antud ülessande puhul tehakse siin sees väga palju tööd.
     * @param args Argumendid mis command lineilt kaasa võttame.
     * @throws IOException Erind kui ei suudeta faili lugeda
     */
    public static void main(String[] args) throws IOException {
        //Loeme osalejad ära
        Queue<Osaleja> osalejad = loeStardinimekiri("osalejad.dat");

        //Avame scanneri millega lugeda kasutaja vastuseid
        Scanner sisse = new Scanner(System.in);

        //List mis hoiab osalejaid kes on lõpetanud
        List<Osaleja> osalejaList = new ArrayList<>();

        //Töötame lõpmatult kuni breakini
        while (true) {
            //Küsime mida kasutaja teha soovib
            System.out.println("Palun valige üks järgmistest tegevustest (L) luba järgmise osaleja rajale, (V) vaata osalenute arvu riikide kaupa, (S) salvesta ja lõpeta: ");
            //Saame vastuse
            String vastus = sisse.nextLine();
            //Analüüsime vastust
            if (vastus.equalsIgnoreCase("L")) {
                Osaleja järgmine = osalejad.poll();
                if (järgmine == null) {
                    System.out.println("Kõik osalejad on lõpetanud!");
                } else {
                    System.out.println("Järgmisena rajal: " + järgmine);
                    System.out.println("Sisesta aeg millisekundites: ");
                    int aeg = Integer.parseInt(sisse.nextLine());
                    järgmine.setAegMillisekundites(aeg);
                    osalejaList.add(järgmine);
                }
            } else if (vastus.equalsIgnoreCase("V")) {
                Map<String, Integer> riigid = riikideKaupa(osalejaList);
                Set<String> riigiteNimed = riigid.keySet();
                if (riigiteNimed.isEmpty()) {
                    System.out.println("Võistlus pole veel alanud!");
                } else {
                    System.out.println("Võistlusel on osalenud järgmised riigid: " + riigiteNimed);
                System.out.println("Sisesta riik: ");
                while (true) {
                    String riik = sisse.nextLine();
                    Integer osalenud = riigid.get(riik);
                    //Map tagastab null kui ei leitud sellist keyd
                    if (osalenud == null) {
                        System.out.println("Sellise riigi kohta pole andmeid, sisesta riik uuesti: ");
                    } else {
                        System.out.println(riik + " nimekirjas osalenuid: " + osalenud);
                        break;
                    }
                }
            }
            } else if (vastus.equalsIgnoreCase("S")) {
                Collections.sort(osalejaList);
                salvestaTulemused("tulemused.txt", osalejaList);
                System.out.println("Salvestatud!");
                break;
            } else {
                System.out.println("Ei ole variant. Proovi uuesti.");
            }
        }
    }

    /**
     * Loeb algsest nimekirjas DIS abil välja osalejad. Vajadusel tagastab erindi.
     * @param failinimi Failinimi kust binaarselt otsime osalejaid
     * @return Queue osalejaid
     * @throws IOException Kui faili ei suudetud avada
     */
    private static Queue<Osaleja> loeStardinimekiri(String failinimi) throws IOException {
        Queue<Osaleja> osalejad = new LinkedList<>();
        DataInputStream dis = new DataInputStream(new FileInputStream(failinimi));
        int mitu = dis.readInt();
        while(mitu > 0) {
            int osalejaKoht = dis.readInt();
            String osalejaNimi = dis.readUTF();
            String osalejaRiik = dis.readUTF();

            try {
                Osaleja osaleja = new Osaleja(osalejaKoht, osalejaNimi, osalejaRiik);
                osalejad.add(osaleja);
            } catch (EbasobivKohtErind e) {
                System.out.println(e.getMessage()); // ei tea kas see v print stackTrace aga arvan pigem see
            }
            mitu -= 1;
        }


        dis.close();

        return osalejad;
    }

    /**
     * Tagastab Mappi riikide kaupa, kes on sõitnud.
     * @param sõiduLõpetanud List osalejatest kes on sõidu ära lõpetanud (s.t neil on aeg)
     * @return Map, kust key on riik ja value on mitu sõitjat sealt lõpetanud
     */
    private static Map<String, Integer> riikideKaupa(List<Osaleja> sõiduLõpetanud) {
        Map<String, Integer> riigid = new HashMap<>();
        for (Osaleja osaleja : sõiduLõpetanud) {
            String riik = osaleja.getRiik();
            int uus = riigid.getOrDefault(riik, 0) + 1;
            riigid.put(riik, uus);
        }

        return riigid;
    }

    /**
     * Isiklik abi meetod mis salvestab faili
     * @param failiNimiKuhu Mis faili nimi kuhu salvestada
     * @param tulemused List täis osalejaid kes on lõpetanud
     * @throws IOException Kui faili ei suudetud avada.
     */
    private static void salvestaTulemused(String failiNimiKuhu, List<Osaleja> tulemused) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(failiNimiKuhu), StandardCharsets.UTF_8);
        BufferedWriter bf = new BufferedWriter(osw);
        for (Osaleja osaleja : tulemused) {
            String salvestada = osaleja.getNimi() + ": " + osaleja.getAegMillisekundites();
            bf.write(salvestada + "\n");
        }

        bf.close();
        osw.close();
    }


}
