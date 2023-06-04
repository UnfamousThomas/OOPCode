package kodu.kodu5;


import java.time.LocalDate;

public class Õpilaspilet implements Dokument {
    private int sünniaasta;
    public Õpilaspilet(int sünniaasta) {
        this.sünniaasta = sünniaasta;
    }
    public boolean onVähemalt12Aastane() {
        return vanusOnVähemalt(12);
        //return sünniaasta + 12 <= LocalDate.now().getYear();
    }

    @Override
    public String toString() {
        return  sünniaasta + ":" + onVähemalt12Aastane();
    }

    @Override
    public boolean vanusOnVähemalt(int miinimum) {
        return sünniaasta + miinimum <= LocalDate.now().getYear();    }
}
