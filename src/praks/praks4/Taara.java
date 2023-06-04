package praks.praks4;

public class Taara {

    private String joogiNimi;
    private char pakendiTähis;
    private String jooja;

    public Taara(String joogiNimi, char pakendiTähis, String jooja) {
        this.joogiNimi = joogiNimi;
        this.pakendiTähis = pakendiTähis;
        this.jooja = jooja;
    }

    public String getJoogiNimi() {
        return joogiNimi;
    }

    public char getPakendiTähis() {
        return pakendiTähis;
    }

    public String getJooja() {
        return jooja;
    }

    public static double tagatisRaha(char tähis) {
        return switch (tähis) {
            case 'A' -> TaaraTest.tagatisA;
            case 'B' -> TaaraTest.tagatisB;
            case 'C' -> TaaraTest.tagatisC;
            case 'D' -> TaaraTest.tagatisD;
            default -> 0;
        };
    }

    public double taaraMaksumus() {
        return tagatisRaha(getPakendiTähis());
    }

    @Override
    public String toString() {
        return getJooja() + " " + getJoogiNimi() + " " + getJoogiNimi() + " " + taaraMaksumus();
    }
}
