package praks.praks5.ex1;

public class Lasketiir implements Lõbustus{


    @Override
    public void lõbusta(Külastaja külastaja) {
        int tabasin = (int) (Math.random() * 20);
        külastaja.lisaKirjeldus("Tabasin lasketiirus " + tabasin + " sihtmärki.");
    }
}
