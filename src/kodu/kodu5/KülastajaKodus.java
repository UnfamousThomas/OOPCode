package kodu.kodu5;

public class KülastajaKodus implements Comparable<KülastajaKodus>{
    private String nimi;
    private int külastatudArv;

    public KülastajaKodus(String nimi, int külastatudArv) {
        this.nimi = nimi;
        this.külastatudArv = külastatudArv;
    }

    public String getNimi() {
        return nimi;
    }

    public int getKülastatudArv() {
        return külastatudArv;
    }

    @Override
    public String toString() {
        return getNimi();
    }


    @Override
    public int compareTo(KülastajaKodus o) {
        return Integer.compare(this.külastatudArv, o.külastatudArv);
    }
}
