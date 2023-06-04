package kodu.lisa2;

public class SuurKivi implements Ruut{

    int morad = 0;
    final static int katki = 9;
    private boolean ruudulTegelane = false;
    @Override
    public boolean võtaVastu(Tegelane tegelane) {
        if(!tegelane.omabEset("kirka")) return false;
        if(morad < katki) {
            morad = morad + 1;
            return false;
        } else {
            morad = morad+1;
            ruudulTegelane = true;
            return true;
        }
    }

    @Override
    public boolean tegelaneVõibLahkuda() {
        if(morad >= katki) {
            ruudulTegelane = false;
            return true;
        }
        return false;
    }

    @Override
    public void saadaTegelaneMinema() {
        if(!ruudulTegelane) throw new RuntimeException("Ruudul pole tegelast");
        else ruudulTegelane=false;
    }

    @Override
    public void joonista(int x, int y) {
        if(morad == 0) {
            System.out.println("suur_kivi.png " +  "(" + x + ", " + y + ")");
        } else if (morad < katki) {
            System.out.println("suur_kivi_" + morad + "_mõra.png " +  "(" + x + ", " + y + ")");
        } else {
            System.out.println("suur_kivi_puru.png " +  "(" + x + ", " + y + ")");
        }
    }
}
