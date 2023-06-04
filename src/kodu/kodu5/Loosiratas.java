
package kodu.kodu5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Loosiratas {

    private List<KülastajaKodus> külastajad = new ArrayList<>();

    public void lisaKülastaja(KülastajaKodus külastaja) {
        külastajad.add(külastaja);
    }

    public void lisaKülastaja(String nimi, int arv) {
        KülastajaKodus külastaja = new KülastajaKodus(nimi, arv);
        lisaKülastaja(külastaja);
    }

    public List<KülastajaKodus> kõigeAktiivsemad(int n) {
        Collections.sort(külastajad);
        Collections.reverse(külastajad);
        if(külastajad.size() < n) return külastajad;
        List<KülastajaKodus> kõigeAktiivsemad = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            kõigeAktiivsemad.add(külastajad.get(i));
        }

        return kõigeAktiivsemad;
    }

    public KülastajaKodus loosiVõitja() {
        List<KülastajaKodus> kelleSeastLoosime = kõigeAktiivsemad(3);
        int indeks = randomIndeks(kelleSeastLoosime.size());

        return kelleSeastLoosime.get(indeks);
    }

    public int randomIndeks(int max) {
        return (int) (Math.random() * (max));
    }
}
