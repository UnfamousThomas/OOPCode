package kodu.kodu4;

public class SõnedeAnalüsaator {
    private String analüüsitavSõne;

    public SõnedeAnalüsaator(String analüüsitavSõne) {
        this.analüüsitavSõne = analüüsitavSõne;
    }

    void väljastaSõne() {
        System.out.println("Analüüsitav sõne on " + analüüsitavSõne);
    }

    double leiaKeskminePikkus() {
        String[] sõned = getAnalüüsitavSõneIlmaChars().split(" ");
        double koguPikkus = 0;

        for (int i = 0; i < sõned.length; i++) {
            koguPikkus = koguPikkus + sõned[i].length();
        }

        return koguPikkus/sõned.length;
    }

    private String getAnalüüsitavSõneIlmaChars() {
        //return analüüsitavSõne.replaceAll("[^a-zA-Z0-9\\s]", "");
        return analüüsitavSõne;
    }
    String leiaPikimSõna() {
        String analüüsitavIlma = getAnalüüsitavSõneIlmaChars();
        String[] sõned = analüüsitavIlma.split(" ");
        String pikim = "";
        int pikimPikkus = 0;

        for (String s : sõned) {
            if(s.length() > pikimPikkus) {
                pikim = s;
                pikimPikkus = s.length();
            }
        }

        return pikim;
    }
}
