package praks.praks9;

import java.util.List;

public class Inimene {
    private String eesnimi;
    private String perenimi;
    private List<String> lasteNimed;

    public Inimene(String eesnimi, String perenimi, List<String> lasteNimed) {
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.lasteNimed = lasteNimed;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(eesnimi);
        stringBuilder.append(" ");
        stringBuilder.append(perenimi);
        stringBuilder.append(":");
        for (String s : lasteNimed) {
            stringBuilder.append(s);
            stringBuilder.append(";");
        }

        return stringBuilder.toString();
    }
}
