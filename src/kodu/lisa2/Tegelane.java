package kodu.lisa2;

import java.util.ArrayList;
import java.util.List;

public class Tegelane {
    private List<String> esemed;
    private boolean uppunud = false;
    public Tegelane() {
        this.esemed = new ArrayList<>();
    }

    public void lisaEse(String ese) {
        esemed.add(ese);
    }

    public void eemaldaEse(String ese) {
        esemed.remove(ese);
    }

    public boolean omabEset(String ese) {
        return esemed.contains(ese);
    }

    public void joonista(int x, int y) {
        if(!uppunud) System.out.println("tegelane.png (" + x + ", " + y + ")");
    }

    public void setUppunud(boolean uppunud) {
        this.uppunud = uppunud;
    }
}
