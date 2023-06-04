package kodu.kodu6.ex6;

import java.time.LocalDate;

public class RistkülikukujulineKook extends Kook{
    private double laius;
    private double pikkus;

    public RistkülikukujulineKook(String koogiNimetus, LocalDate parimEnne, double hindRuutSentimeetriKohta, double laius, double pikkus) {
        super(koogiNimetus, parimEnne, hindRuutSentimeetriKohta);
        this.laius = laius;
        this.pikkus = pikkus;
    }

    @Override
    public double pindala() {
        return laius*pikkus;
    }
}
