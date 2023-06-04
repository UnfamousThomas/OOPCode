package praks.praks6;

public class SuurimaViiviseLeidja implements Kontrollija{
    private String suurimLaenutajaNimi;
    private String suurimLaenutajaKirjeldus;
    private double suurimLaenutajaSuurus;

    public void saadaHoiatus() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HOIATUS!");
        stringBuilder.append("\n");
        stringBuilder.append("Laenutaja: ").append(suurimLaenutajaNimi);
        stringBuilder.append("\n");
        stringBuilder.append("Kirjeldus: ").append(suurimLaenutajaKirjeldus);
        stringBuilder.append("\n");
        stringBuilder.append("Suurus: ").append(suurimLaenutajaSuurus);
        stringBuilder.append("\n-------------");

        System.out.println(stringBuilder);

    }
    @Override
    public void salvestaViivis(String laenutajaNimi, String teoseKirjeldus, double viiviseSuurus) {
        if(suurimLaenutajaSuurus < viiviseSuurus) {
            this.suurimLaenutajaSuurus = viiviseSuurus;
            this.suurimLaenutajaKirjeldus = teoseKirjeldus;
            this.suurimLaenutajaNimi = laenutajaNimi;
        }
    }
}
