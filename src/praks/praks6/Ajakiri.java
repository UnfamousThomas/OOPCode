package praks.praks6;

public class Ajakiri extends Teos{
    int aastalIlmunud;
    int ajaKirjaNumber;
    public Ajakiri(String teoseKirjeldus, String teoseTähis, String laenutaja, int päevadeArv, int aasta, int ajaKirjaNumber) {
        super(teoseKirjeldus, teoseTähis, laenutaja, päevadeArv);
        this.aastalIlmunud = aasta;
        this.ajaKirjaNumber = ajaKirjaNumber;
    }

    @Override
    public boolean kasHoidlast() {
        return aastalIlmunud <= 2000;
    }

    @Override
    public String toString() {
        return super.toString() + "Ajakiri time!";
    }
}
