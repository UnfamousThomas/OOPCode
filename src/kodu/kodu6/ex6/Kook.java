package kodu.kodu6.ex6;

import java.time.LocalDate;

public abstract class Kook implements Comparable<Kook>{
    private String koogiNimetus;
    private LocalDate parimEnne;
    private double hindRuutSentimeetriKohta;

    public Kook(String koogiNimetus, LocalDate parimEnne, double hindRuutSentimeetriKohta) {
        if(koogiNimetus == null || koogiNimetus.equals("")|| koogiNimetus.equals(" ")) {
            this.koogiNimetus = "the cake is a lie";
        } else {
            this.koogiNimetus = koogiNimetus;
        }
        this.parimEnne = parimEnne;
        this.hindRuutSentimeetriKohta = hindRuutSentimeetriKohta;
    }

    public abstract double pindala();
    public double koogiHind() {
        return (double) Math.round(pindala() * hindRuutSentimeetriKohta * 100) / 100;

    }

    @Override
    public String toString() {
        return koogiNimetus + " - " + koogiHind() + " - " + parimEnne.toString();
    }

    @Override
    public int compareTo(Kook o) {
        return parimEnne.compareTo(o.parimEnne);
    }
}
