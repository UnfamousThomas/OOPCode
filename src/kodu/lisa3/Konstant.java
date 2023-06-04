package kodu.lisa3;

import java.util.Map;

public class Konstant extends Avaldis{
    Konstant(String esimenePool) {
        super(esimenePool);
    }
    Konstant(int konstant) {
        super(String.valueOf(konstant));
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
        return getEsimenePool();
    }
}
