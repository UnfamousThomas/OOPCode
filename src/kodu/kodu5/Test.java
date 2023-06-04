package kodu.kodu5;

public class Test {

    public static void main(String[] args) {
        /*Atraktsioon mäed = new Atraktsioon("mäed", 12);
        Atraktsioon minaEiTea = new Atraktsioon("minaeitea", 14);


        Dokument[] dokumendid = {
                new IdKaart("4202222222"),
                new Õpilaspilet(2010)
        };
        System.out.println("ei sobi (mäed): " + mäed.ebasobivadDokumendid(dokumendid));
        System.out.println("ei sobi (maeitea): " + minaEiTea.ebasobivadDokumendid(dokumendid));*/

        KülastajaKodus külastaja1 = new KülastajaKodus("Peeter",1);
        KülastajaKodus külastaja2 = new KülastajaKodus("Jaanus",3);
        KülastajaKodus külastaja3 = new KülastajaKodus("Jaak", 5);
        KülastajaKodus külastaja4 = new KülastajaKodus("Peep", 6);
        KülastajaKodus külastaja5 = new KülastajaKodus("Anu", 7);

        Loosiratas loosiratas = new Loosiratas();
        loosiratas.lisaKülastaja(külastaja1);
        loosiratas.lisaKülastaja(külastaja2);
        loosiratas.lisaKülastaja(külastaja3);
        loosiratas.lisaKülastaja(külastaja4);
        loosiratas.lisaKülastaja(külastaja5);

        System.out.println(loosiratas.loosiVõitja());
    }
}
