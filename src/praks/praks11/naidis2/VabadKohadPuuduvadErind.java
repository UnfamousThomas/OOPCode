package praks.praks11.naidis2;

public class VabadKohadPuuduvadErind extends RuntimeException{
    public VabadKohadPuuduvadErind(String msg) {
        super("Vabad kohad selles seanssis on otsas! " + msg);
    }
}
