package kodu.kodu6.ex4;

public class Seljakott extends Kott{
    int maxInimesePikkus;
    int maxInimeseLaius;

    public Seljakott(String kotifirma, double kotiMahtLiitrites, String kotiTooteId,
                     int maxInimeseLaius, int maxInimesePikkus) {
        super(kotifirma, kotiMahtLiitrites, kotiTooteId);
        this.maxInimeseLaius = maxInimeseLaius;
        this.maxInimesePikkus = maxInimesePikkus;
    }
}
