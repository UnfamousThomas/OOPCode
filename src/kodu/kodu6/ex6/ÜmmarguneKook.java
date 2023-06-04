package kodu.kodu6.ex6;

import java.time.LocalDate;

public class ÜmmarguneKook extends Kook{
    private double läbiMõõt;

    public ÜmmarguneKook(String koogiNimetus, LocalDate parimEnne, double hindRuutSentimeetriKohta, double läbiMõõt) {
        super(koogiNimetus, parimEnne, hindRuutSentimeetriKohta);
        this.läbiMõõt = läbiMõõt;
    }

    @Override
    public double pindala() {
        return Math.PI * (läbiMõõt/2)*(läbiMõõt/2);
    }
}
