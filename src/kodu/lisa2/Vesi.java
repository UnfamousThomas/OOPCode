package kodu.lisa2;

public class Vesi implements Ruut{

    private boolean mullid = false;
    private Tegelane tegelane;
    @Override
    public boolean võtaVastu(Tegelane tegelane) {
        mullid = true;
        this.tegelane = tegelane;
        tegelane.setUppunud(true);
        return true;
    }

    @Override
    public boolean tegelaneVõibLahkuda() {
        return false;
    }

    @Override
    public void saadaTegelaneMinema() {
        if(tegelane == null) throw new RuntimeException("Ruudul pole tegelast");
    }

    @Override
    public void joonista(int x, int y) {
        if(mullid) System.out.println("mullid.png " +  "(" + x + ", " + y + ")");
        else System.out.println("vesi.png " +  "(" + x + ", " + y + ")");
    }
}
