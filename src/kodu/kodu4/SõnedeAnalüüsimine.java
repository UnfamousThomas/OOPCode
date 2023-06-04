package kodu.kodu4;

public class SõnedeAnalüüsimine {

    public static void main(String[] args) {
        SõnedeAnalüsaator sõnedeAnalüsatoor = new SõnedeAnalüsaator("" +
                "See on kõige pikeeeeeeeeeeem sõna.");

        sõnedeAnalüsatoor.väljastaSõne();

        System.out.println("Keskmine pikkus: " + sõnedeAnalüsatoor.leiaKeskminePikkus());

        System.out.println("Pikim sõna: " + sõnedeAnalüsatoor.leiaPikimSõna());
    }
}
