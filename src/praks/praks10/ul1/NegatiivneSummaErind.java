package praks.praks10.ul1;

public class NegatiivneSummaErind extends RuntimeException{

    public NegatiivneSummaErind(double arv) {
    super("OIH! Negatiivne summa raha: " + arv + ". Oled võlgu!");
    }
}
