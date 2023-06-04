package kodu.kodu10;

/**
 * @author thomp (17/04/2023)
 */
public class VigaseKoordinaadiErind extends RuntimeException{
    public VigaseKoordinaadiErind(String error) {
        super("Vigased koordinaadid: " + error);
    }
}
