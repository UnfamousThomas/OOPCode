package kodu.kodu3;

public class Programmeerija {
    public Programmeerija(String nimi, double riduKoodi, int tasseKohvi, Kohv kohv) {
        this.programmeerijaNimi = nimi;
        this.riduKoodi = riduKoodi;
        this.tasseKohvi = tasseKohvi;
        this.lemmikkohv = kohv;
    }

    public Programmeerija(String nimi, double koodiread) {
        this.programmeerijaNimi = nimi;
        this.riduKoodi = koodiread;
    }
    private String programmeerijaNimi;
    private double riduKoodi;
    private int tasseKohvi;
    private Kohv lemmikkohv;

    public int getTasseKohvi() {
        return tasseKohvi;
    }

    public double getRiduKoodi() {
        return riduKoodi;
    }

    public void setTasseKohvi(int tasseKohvi) {
        this.tasseKohvi = tasseKohvi;
    }

    public void setRiduKoodi(double riduKoodi) {
        this.riduKoodi = riduKoodi;
    }

    public boolean kasJoobKohvi() {
        if(lemmikkohv == null) return false;

        return true;
    }

    public Kohv getLemmikkohv() {
        return lemmikkohv;
    }

    public double koodiTassiKohta() {
        if(!kasJoobKohvi()) {
            System.out.println(programmeerijaNimi + " EI JOO KOHVI!");
            return -1.0;
        } else {
            return getRiduKoodi() / getTasseKohvi();
        }
    }

    @Override
    public String toString() {
        if(!kasJoobKohvi()) {
            return programmeerijaNimi + " ei joo kohvi.";
        } else {
            return programmeerijaNimi + " " + getLemmikkohv().getKohvisort() + " " + getLemmikkohv().getHind()
                    + getLemmikkohv().tassideMaksumus(getTasseKohvi()) + " " + koodiTassiKohta();
        }
    }
}
