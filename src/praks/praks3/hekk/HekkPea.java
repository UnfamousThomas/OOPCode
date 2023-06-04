package praks.praks3.hekk;

public class HekkPea {
    public static void main(String[] args) {
        Põõsas põõsas = new Põõsas(1,2);
        Põõsas põõsas2 = new Põõsas(2.4,5.3);
        Põõsas põõsas3 = new Põõsas(30, 1.0);
        Põõsas põõsas4 = new Põõsas(3.0, 1);
        Põõsas põõsas5 = new Põõsas(4.0, 0.5);

        Põõsas[] põõsad = {põõsas,põõsas2,põõsas3,põõsas4,põõsas5};

        Hekk hekk = new Hekk(
                "Suur hekk",
                põõsad
        );

        System.out.println(hekk);
        for (Põõsas p : põõsad) {
            System.out.println(p);
        }
    }
}
