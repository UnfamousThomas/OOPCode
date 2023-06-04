package kodu.kodu5;


import java.util.ArrayList;
import java.util.List;

public class Atraktsioon {
   // var a = 5;
    private String nimi;
    private int miinimumVanus;

    public Atraktsioon(String nimi, int miinimumVanus) {
        this.nimi = nimi;
        this.miinimumVanus = miinimumVanus;
    }

    public boolean vanusedSobivad(Dokument[] dokumendid) {
        for (Dokument dokument : dokumendid) {
            if (!dokument.vanusOnVähemalt(miinimumVanus)) return false;
        }
        return true;
    }
//        for (IdKaart id : idKaardid) {
//            if (!id.onVähemalt12Aastane())
//                return false;
//        }
//        for (Õpilaspilet pilet : õpilaspiletid) {
//            if (!pilet.onVähemalt12Aastane())
//                return false;
//        }
//        return true;

    public List<Dokument> ebasobivadDokumendid(Dokument[] dokuments) {
        List<Dokument> ebaSobivad = new ArrayList<>();

        for (Dokument dokument : dokuments) {
            if(!(dokument.vanusOnVähemalt(this.miinimumVanus))) {
                //on alla 12 aastase
                ebaSobivad.add(dokument);
            }
        }

        return ebaSobivad;
    }

    @Override
    public String toString() {
        return nimi + " - " + miinimumVanus;
    }
}