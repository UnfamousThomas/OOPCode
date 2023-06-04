package kodu.kodu6.ex4;

import java.util.List;

public class Kott {
    //https://imgur.com/a/L9IDf3V
    private String kotifirma;
    private double kotiMahtLiitrites;
    private String kotiTooteId;

    public Kott(String kotifirma, double kotiMahtLiitrites, String kotiTooteId) {
        this.kotifirma = kotifirma;
        this.kotiMahtLiitrites = kotiMahtLiitrites;
        this.kotiTooteId = kotiTooteId;
    }

    public double getKotiMahtLiitrites() {
        return kotiMahtLiitrites;
    }

    public double kotiMathKuupDetsimeetrites() {
        return getKotiMahtLiitrites();
    }

    public String toString() {
        return kotifirma + "-" + kotiTooteId + "-" + kotifirma;
    }
}
