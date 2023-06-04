package praks.praks11.naidis1;

public class FormaadiErind extends RuntimeException{
    public FormaadiErind(String msg) {
        super("Formaat vale: " + msg);
    }
}

