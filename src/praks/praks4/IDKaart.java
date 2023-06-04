package praks.praks4;

public class IDKaart {

    private String idKaardiNumber;
    private String omanikuNimi;
    private String isikukood;

    public IDKaart(String idKaardiNumber, String omanikuNimi, String isikukood) {
        this.idKaardiNumber = idKaardiNumber;
        this.omanikuNimi = omanikuNimi;
        this.isikukood = isikukood;
    }

    public String getIdKaardiNumber() {
        return idKaardiNumber;
    }

    public void setIdKaardiNumber(String idKaardiNumber) {
        this.idKaardiNumber = idKaardiNumber;
    }

    public String getOmanikuNimi() {
        return omanikuNimi;
    }

    public void setOmanikuNimi(String omanikuNimi) {
        this.omanikuNimi = omanikuNimi;
    }

    public String getIsikukood() {
        return isikukood;
    }

    public void setIsikukood(String isikukood) {
        this.isikukood = isikukood;
    }

    public String sugu() {
        int esimene = Integer.parseInt(String.valueOf(getIsikukood().charAt(0)));

        if(esimene == 2 || esimene == 4 || esimene == 6) {
            return "naine";
        } else {
            return "mees";
        }
    }

    public String sünnikuupäev() {
        return "0";
    }

    @Override
    public String toString() {
        return sugu() + " " + getOmanikuNimi() + " " + sünnikuupäev();
    }
}
