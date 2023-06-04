package praks.praks11.naidis2;

public class KohtHõivatudErind extends RuntimeException{
    public KohtHõivatudErind(int koht) {
        super("Koht " + koht + " sellel seanssil on juba hõivatud!");
    }
}
