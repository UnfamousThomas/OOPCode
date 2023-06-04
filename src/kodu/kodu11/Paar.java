package kodu.kodu11;
/**
 * @author thomp (24/04/2023)
 */
public class Paar<T, N> {
    private T esimene;
    private N teine;
    public Paar(T esimene, N teine) {
        this.esimene = esimene;
        this.teine = teine;
    }

    public T getEsimene() {
        return esimene;
    }

    public void setEsimene(T esimene) {
        this.esimene = esimene;
    }

    public N getTeine() {
        return teine;
    }

    public void setTeine(N teine) {
        this.teine = teine;
    }

    @Override
    public String toString() {
        return getEsimene() + "; " + getTeine();
    }

    public static void main(String[] args) {
        Paar<String, Integer> esimenePaar = new Paar<>("Aleks", 15);
        Paar<String, String> teinePaar = new Paar<>("Peeter", "Turu 15");
        System.out.println(esimenePaar);
        System.out.println(teinePaar);
    }
}
