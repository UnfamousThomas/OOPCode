package praks.praks6;

public class Raamat extends Teos{
    private String pealkiri;
    private String autor;
    public Raamat(String teoseKirjeldus, String teoseTähis, String laenutaja, int päevadeArv, String autor, String pealkiri) {
        super(teoseKirjeldus, teoseTähis, laenutaja, päevadeArv);
        this.pealkiri = pealkiri;
        this.autor = autor;
    }

    @Override
    public boolean kasHoidlast() {
        String tähis = getTeoseTähis();
        if(tähis.equals("sinine") || tähis.equals("kollane")) return true;
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "; TEGU ON RAAMATUGA!";
    }
}
