package praks.praks11.naidis2;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Seanss {
    String film;
    LocalDateTime algusAeg;
    Saal saal;
    Set<Pilet> müüdud;

    public Seanss(String film, LocalDateTime algusAeg, Saal saal) {
        this.film = film;
        this.algusAeg = algusAeg;
        this.saal = saal;
        this.müüdud = new HashSet<>();
    }

    public LocalDateTime getAlgusAeg() {
        return algusAeg;
    }

    public Saal getSaal() {
        return saal;
    }

    public Set<Pilet> getMüüdud() {
        return müüdud;
    }

    public String getFilm() {
        return film;
    }

    public Pilet müüPilet(int soovitudKohaNumber) {
        if(vabuKohti() == 0) throw new VabadKohadPuuduvadErind("Saal number: " + saal.getNumber());
        for (Pilet pilet : müüdud) {
            if(pilet.getKoht() == soovitudKohaNumber) throw new KohtHõivatudErind(soovitudKohaNumber);
        }

        // seansi algusaeg / juhuslik arv lõigust [0,9] / hetkeaeg millisekundites
        Random random = new Random();
        String id = getAlgusAeg().toString() + "/" + random.nextInt(10) + "/" + System.currentTimeMillis();
        Pilet pilet = new Pilet(soovitudKohaNumber, id);
        müüdud.add(pilet);

        return pilet;
    }

    public int vabuKohti() {
        int arv = saal.getKohtadeArv() - müüdud.size();
        if(arv < 0) arv = 0;
        return arv;
    }
}
