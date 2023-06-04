package praks.praks3.reisid;

public class PeaKlass {

    public static void main(String[] args) {
        Lennuk lennuk1 = new Lennuk(
                "Fokker F50",
                530,
                46
        );
        Lennuk lennuk2 = new Lennuk(
                "BN-2",
                170,
                9
        );

        Reis reis = new Reis(
                "Itaalia",
                300,
                lennuk1,
                10
        );

        Reis reis2 = new Reis(
                "Saaremaa",
                100,
                lennuk2,
                3
        );

        Reis reis3 = new Reis(
                "Moskva",
                600,
                lennuk1,
                1
        );

        System.out.println(reis3);
        System.out.println(reis2);
        System.out.println(reis);
    }
}
