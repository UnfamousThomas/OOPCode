package kodu.kodu4;

public class Kodanik {

    private String eesnimi;
    private String perekonnanimi;
    private String isikukood;
    private boolean huhiloaOlemasolu;

    public Kodanik(String eesnimi, String perekonnanimi, String isikukood, boolean huhiloaOlemasolu) {
        this.eesnimi = eesnimi;
        this.perekonnanimi = perekonnanimi;
        this.isikukood = isikukood;
        this.huhiloaOlemasolu = huhiloaOlemasolu;
    }

    public String getIsikukood() {
        return isikukood;
    }

    public boolean kasJuhilubaOnOlemas() {
        return huhiloaOlemasolu;
    }

    public boolean kasOnTäiskasvanuAastal2018() {
        if(2018 - Integer.valueOf(tagastaSünniaasta()) >= 18) {
            return true;
        }

        return false;
    }

    private String tagastaSünniaasta() {
       String suguSajand = String.valueOf(getIsikukood().charAt(0));
       if(suguSajand.equals("5") || suguSajand.equals("6")) {
           return "20" + getIsikukood().charAt(1) + getIsikukood().charAt(2);
       }

        if(suguSajand.equals("4") || suguSajand.equals("3")) {
            return "19" + getIsikukood().charAt(1) + getIsikukood().charAt(2);
        }

        if(suguSajand.equals("1") || suguSajand.equals("2")) {
            return "18" + getIsikukood().charAt(1) + getIsikukood().charAt(2);
        }

        return "0";
    }

    @Override
    public String toString() {
        return eesnimi + " " + perekonnanimi;
    }
}
