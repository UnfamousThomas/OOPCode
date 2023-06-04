package praks.praks3.reisid;

public class Reis {

    private String sihtPunkt;
    private int kaugus;
    private Lennuk lennuk;
    private int muududPiletid;

    public Reis(String sihtPunkt, int kaugus, Lennuk lennuk, int muududPiletid) {
        this.sihtPunkt = sihtPunkt;
        this.kaugus = kaugus;
        this.lennuk = lennuk;
        this.muududPiletid = muududPiletid;
    }

    public String getSihtPunkt() {
        return sihtPunkt;
    }

    public int getKaugus() {
        return kaugus;
    }

    public Lennuk getLennuk() {
        return lennuk;
    }

    public int getMuududPiletid() {
        return muududPiletid;
    }

    public int arvutaKestvusMinutites() {
        return (int)(Math.round(kaugus*60/lennuk.getKeskKiirus()));
    }


    public int arvutaVabadKohad() {
        return getLennuk().getMaxReisjad() - getMuududPiletid();
    }

    @Override
    public String toString() {
        return "Reis{" +
                "sihtPunkt='" + sihtPunkt + '\'' +
                ", kaugus=" + kaugus +
                ", muududPiletid=" + muududPiletid +
                "} Vabad kohad:" + arvutaVabadKohad() + " Arvuta kestvus: " + arvutaKestvusMinutites();
    }
}
