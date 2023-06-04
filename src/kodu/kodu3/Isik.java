package kodu.kodu3;

class Isik {

    private String nimi; // isendiväli isiku nime jaoks
    private double pikkus; // isendiväli isiku pikkuse jaoks

    private final String isikukood;
    private double mass;

    // konstruktor
    Isik(String isikuNimi, double isikuPikkus, String isikuKood, double mass) {
        this.nimi = isikuNimi;
        this.pikkus = isikuPikkus;
        this.isikukood = isikuKood;
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "(" + nimi + ": " + pikkus + ":" + isikukood + ":" + mass + ")";
    }

    public double getMass() {
        return mass;
    }

    public double getPikkus() {
        return pikkus;
    }

    public String getIsikukood() {
        return isikukood;
    }

    public String getNimi() {
        return nimi;
    }
    public void setMass(double mass) {
        if(mass > 0) this.mass = mass;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setPikkus(double pikkus) {
        if(pikkus > 0) {
            this.pikkus = pikkus;
        }
    }

    public double arvutaKehaMassiIndeks() {
        return getMass() / (getPikkus() * getPikkus());
    }

    public int arvutaSuusaPikkus() {
        return (int) Math.round(getPikkus()) + 10;
    } //Klassikalised suusad

    public String Tagasta4ViimastIsikukoodiNumbrit(int amount) {
        return getIsikukood().substring(getIsikukood().length() - amount);
    }

}