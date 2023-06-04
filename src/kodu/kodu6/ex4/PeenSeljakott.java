package kodu.kodu6.ex4;

public class PeenSeljakott extends Seljakott{
    double hind;
    public PeenSeljakott(String kotifirma, double kotiMahtLiitrites, String kotiTooteId, int maxInimeseLaius, int maxInimesePikkus, double hind) {
        super(kotifirma, kotiMahtLiitrites, kotiTooteId, maxInimeseLaius, maxInimesePikkus);
        this.hind = hind;
    }

    //Meetodite ülekatmine
    @Override
    public double getKotiMahtLiitrites() {
        return 10;
    }
}
