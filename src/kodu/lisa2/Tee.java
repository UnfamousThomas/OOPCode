package kodu.lisa2;

public class Tee implements Ruut {
    boolean ruudulTegelane = false;
    private String ese = "";
    public Tee(){}
    public Tee(String ese) {
        this.ese = ese;
    }
    @Override
    public boolean võtaVastu(Tegelane tegelane) {
        if(ese != null && !(ese.equals(""))) {
            tegelane.lisaEse(ese);
            ese = "";
        }
        ruudulTegelane = true;
        return true;
    }

    @Override
    public boolean tegelaneVõibLahkuda() {
        return true;
    }

    @Override
    public void saadaTegelaneMinema() {
        if(!ruudulTegelane) throw new RuntimeException("Ruudul pole tegelast");
        else ruudulTegelane=false;
    }

    @Override
    public void joonista(int x, int y) {
        if(!ese.equals("")) System.out.println("ese.png" + "(" + x + ", " + y + ")");
        System.out.println("Tee.png " + "(" + x + ", " + y + ")");

    }
}
