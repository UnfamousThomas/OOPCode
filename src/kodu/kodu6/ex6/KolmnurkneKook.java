package kodu.kodu6.ex6;

import java.time.LocalDate;

public class KolmnurkneKook extends Kook{
    private double külgPikkusA;
    private double külgPikkusB;
    private double külgPikkusC;

    public KolmnurkneKook(String koogiNimetus, LocalDate parimEnne, double hindRuutSentimeetriKohta, double külgPikkusA, double külgPikkusB, double külgPikkusC) {
        super(koogiNimetus, parimEnne, hindRuutSentimeetriKohta);
        this.külgPikkusA = külgPikkusA;
        this.külgPikkusB = külgPikkusB;
        this.külgPikkusC = külgPikkusC;
    }

    @Override
    public double pindala() {
        double p = (külgPikkusA + külgPikkusB + külgPikkusC)/2;
        double pa = p - külgPikkusA;
        double pb = p-külgPikkusB;
        double pc = p-külgPikkusC;
        double korrutis = pa*pb*pc*p;
        return Math.sqrt(korrutis);
    }
}
