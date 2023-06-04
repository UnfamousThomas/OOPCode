package kodu.lisa3;

import java.util.Map;

public abstract class Avaldis {

    protected Avaldis(String esimenePool, String teinePool) {
      this.esimenePool = esimenePool;
      this.teinePool = teinePool;
    }

    Avaldis(String esimenePool) {
        this.esimenePool = esimenePool;
    }
    private String esimenePool;
    private String teinePool;
    public abstract int väärtusta(Map<Character, Integer> väärtused);
    public abstract Avaldis lihtsusta();

    public String getEsimenePool() {
        return esimenePool;
    }

    public String getTeinePool() {
        return teinePool;
    }

    @Override
    public String toString() {
        return "Tavaline avaldis: " + getEsimenePool() + " " + getTeinePool();
    }
}
