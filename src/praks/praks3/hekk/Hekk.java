package praks.praks3.hekk;

public class Hekk {

    private String nimi;
    private Põõsas[] põõsad;

    public Hekk(String nimi, Põõsas[] põõsad) {
        this.nimi = nimi;
        this.põõsad = põõsad;
    }

    public double kõrgeimHekkKõrgus() {
        double kõrgeim = põõsad[0].getKõrgus();
        for (int i = 0; i < põõsad.length; i++) {
           if(kõrgeim < põõsad[i].getKõrgus()) {
               kõrgeim = põõsad[i].getKõrgus();
           }
        }

        return kõrgeim;
    }

    public double hekkiPikkus() {
        double pikkus = 0;

        for (Põõsas põõsas : põõsad) {
            pikkus = põõsas.getLaius() + pikkus;
        }

        return pikkus;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return getNimi() + "; Kõrgeim: " + kõrgeimHekkKõrgus() + "; Pikkus: " + hekkiPikkus();
    }
}
