package kodu.kodu10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thomp (17/04/2023)
 */
public class Pilt {
    private int kõrgus;
    private int laius;
    int[] piksliToonid;
    int maxPiksel;

    public Pilt(int laius, int kõrgus) {
        this.laius = laius;
        this.kõrgus = kõrgus;
        this.piksliToonid = new int[laius*kõrgus];
        this.maxPiksel = laius*kõrgus-1;

    }
    public int arvutaIndeks(int x, int y) {
        return y*laius + x;
    }


    public void määraPiksel(int x, int y, int uus) {
        int indeks = arvutaIndeks(x,y);
        if(!kasOnKorrektsedKoordinaadid(x,y) || indeks > maxPiksel) throw new VigaseKoordinaadiErind(x + ", " + y + " ei sobi!");
        else if(uus < 0 || uus > 255) throw new VigaseVärviErind(uus + " ei sobi!");
        piksliToonid[indeks] = uus;
    }

    public int annaPiksel(int x, int y) {
        int indeks = arvutaIndeks(x,y);
        if(!kasOnKorrektsedKoordinaadid(x,y) || arvutaIndeks(x,y) > maxPiksel) throw new VigaseKoordinaadiErind(x + ", " + y + " ei sobi!");
        return piksliToonid[indeks];
    }

    private boolean kasOnKorrektsedKoordinaadid(int x, int y) {
        if(x > laius-1) return false;
        if(y > kõrgus-1) return false;
        if(x < 0 || y < 0) return false;
        return true;
    }


}
