package kodu.lisa3.tehted;

import kodu.lisa3.Avaldis;

import java.util.Map;

public class Korrutis extends Avaldis {
    private Avaldis avaldis1;
    private Avaldis avaldis2;
    Korrutis(Avaldis avaldis1, Avaldis avaldis2) {
        super(avaldis1.getEsimenePool(), avaldis2.getEsimenePool());
        this.avaldis1 = avaldis1;
        this.avaldis2 = avaldis2;
    }


    @Override
    public int väärtusta(Map<Character, Integer> väärtused) {
        return 0;
    }

    @Override
    public Avaldis lihtsusta() {
        return null;
    }

    @Override
    public String toString() {
        return avaldis1.getEsimenePool() + " * " + avaldis2.getEsimenePool();
    }
}
