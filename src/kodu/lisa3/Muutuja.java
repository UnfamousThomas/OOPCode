package kodu.lisa3;

import java.util.Map;

public class Muutuja extends Avaldis{
    Muutuja(String esimenePool) {
        super(esimenePool);
    }
    Muutuja(char konstant) {
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
}
