package kt.kt2;

public class Osaleja implements Comparable<Osaleja>{

    private int praeguneKoht;
    private String nimi;
    private String riik;
    private int aegMillisekundites = 0;

    public Osaleja(int praeguneKoht, String nimi, String riik) throws EbasobivKohtErind {
        if(praeguneKoht < 1) throw new EbasobivKohtErind("Koht ei sobi, " + nimi + ": " + praeguneKoht);
        this.praeguneKoht = praeguneKoht;
        this.nimi = nimi;
        this.riik = riik;
    }

    public int getPraeguneKohtEdetabelis() {
        return praeguneKoht;
    }

    public String getNimi() {
        return nimi;
    }

    public String getRiik() {
        return riik;
    }

    public int getAegMillisekundites() {
        return aegMillisekundites;
    }

    public void setAegMillisekundites(int aegMillisekundites) {
        this.aegMillisekundites = aegMillisekundites;
    }

    @Override
    public String toString() {
        return getNimi() + " (" + getRiik() + ", edetabelis praegu kohal " + getPraeguneKohtEdetabelis() + ")";
    }

    /**
     * Võrdleme objekte et saaks neid sorteerida
     * @param o Mis osalejaga võrrelda
     * @return Tagastab 1 kui aeg on suurem, -1 kui aeg väiksem, 0 kui võrdne.
     */
    @Override
    public int compareTo(Osaleja o) {
        if(this.getAegMillisekundites() > o.getAegMillisekundites()) return 1;
        else if(this.getAegMillisekundites() < o.getAegMillisekundites()) return -1;
        return 0;
    }
}
