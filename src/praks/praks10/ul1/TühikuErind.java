package praks.praks10.ul1;

public class TühikuErind extends Exception{
    public TühikuErind(String s) {
        super("Tühik peale kirjavahemärki: " + s);
    }
}
