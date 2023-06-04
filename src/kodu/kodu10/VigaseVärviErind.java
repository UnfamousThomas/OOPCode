package kodu.kodu10;

/**
 * @author thomp (17/04/2023)
 */
public class VigaseVärviErind extends RuntimeException{
    public VigaseVärviErind(String error) {
        super("Vigane värv: " + error);
    }
}
