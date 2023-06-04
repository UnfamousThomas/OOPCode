package praks.praks4;

public class Tagastaja {

    private String tagastajaNimi;

    public Tagastaja(String tagastajaNimi) {
        this.tagastajaNimi = tagastajaNimi;
    }

    public String getTagastajaNimi() {
        return tagastajaNimi;
    }

    public void setTagastajaNimi(String tagastajaNimi) {
        this.tagastajaNimi = tagastajaNimi;
    }

    public double koguMaksumus(Taara[] taara) {
        double summa = 0;
        for (Taara taaraEl : taara) {
            summa = summa + taaraEl.taaraMaksumus();
        }

        return summa;
    }

    public int paljuOnSama(Taara[] taara) {
        int mitu = 0;
        for (Taara taaraEl : taara) {
            if(taaraEl.getJooja().equals(getTagastajaNimi())) {
                mitu = mitu + 1;
            }
        }
        return mitu;
    }

    @Override
    public String toString() {
        return getTagastajaNimi();
    }
}
