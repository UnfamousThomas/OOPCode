package kodu.lisa3.tehted;

import kodu.lisa3.Avaldis;

import java.util.Map;

public class Summa extends Avaldis {
    private Avaldis avaldis1;
    private Avaldis avaldis2;
    Summa(Avaldis avaldis1, Avaldis avaldis2) {
        super(avaldis1.getEsimenePool(), avaldis2.getEsimenePool());
        this.avaldis1 = avaldis1;
        this.avaldis2 = avaldis2;
    }

    Summa(Avaldis avaldis1) {
        super(avaldis1.getEsimenePool(), null);
        this.avaldis1 = avaldis1;

    }


    @Override
    public int väärtusta(Map<Character, Integer> väärtused) {
        return 0;
    }

    @Override
    public Avaldis lihtsusta() {
        if(avaldis1.lihtsusta().getEsimenePool().equals("0")) {
            return new Summa(avaldis2);
        }
        if(avaldis2.lihtsusta().getEsimenePool().equals("0")) {
            return new Summa(avaldis1);
        }

        return this;
    }

    @Override
    public String toString() {
        return avaldis1.getEsimenePool() + " + " + avaldis2.getEsimenePool();
    }
}
