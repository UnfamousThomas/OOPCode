package praks.praks6;

import java.util.ArrayList;
import java.util.List;

public class ViiviseHoiataja implements Kontrollija {

    private double lubatudViivis;
    List<String> laenutajateNimed;

    public ViiviseHoiataja(double lubatudViivis) {
        this.lubatudViivis = lubatudViivis;
        laenutajateNimed = new ArrayList<>();
    }

    public List<String> getHoiatatavadLaenutajad() {
        return this.laenutajateNimed;
    }

    @Override
    public void salvestaViivis(String laenutajaNimi, String teoseKirjeldus, double viiviseSuurus) {
        if(viiviseSuurus > lubatudViivis) laenutajateNimed.add(laenutajaNimi);
    }
}
