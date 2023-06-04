package praks.praks4;

public class Tantsupaar {

    private String poisiNimi;
    private int poisiSünniaasta;
    private String tüdrukuNimi;
    private int tüdrukuSünniaasta;

    public Tantsupaar(String poisiNimi, int poisiSünniaasta, String tüdrukuNimi, int tüdrukuSünniaasta) {
        this.poisiNimi = poisiNimi;
        this.poisiSünniaasta = poisiSünniaasta;
        this.tüdrukuNimi = tüdrukuNimi;
        this.tüdrukuSünniaasta = tüdrukuSünniaasta;
    }

    public String getPoisiNimi() {
        return poisiNimi;
    }

    public void setPoisiNimi(String poisiNimi) {
        this.poisiNimi = poisiNimi;
    }

    public int getPoisiSünniaasta() {
        return poisiSünniaasta;
    }

    public void setPoisiSünniaasta(int poisiSünniaasta) {
        this.poisiSünniaasta = poisiSünniaasta;
    }

    public String getTüdrukuNimi() {
        return tüdrukuNimi;
    }

    public void setTüdrukuNimi(String tüdrukuNimi) {
        this.tüdrukuNimi = tüdrukuNimi;
    }

    public int getTüdrukuSünniaasta() {
        return tüdrukuSünniaasta;
    }

    public void setTüdrukuSünniaasta(int tüdrukuSünniaasta) {
        this.tüdrukuSünniaasta = tüdrukuSünniaasta;
    }

    public int tagasaVanimAasta(int hetkelAasta) {
        int tüdVanus = hetkelAasta - getTüdrukuSünniaasta();
        int poissVanus = hetkelAasta - getPoisiSünniaasta();

        return Math.max(poissVanus, tüdVanus);
    }

    public boolean kasSündisidSamalAastal() {
        return getTüdrukuSünniaasta() == getPoisiSünniaasta();
    }

    public String tagastaPerenimed() {
        String[] poisiPereArr = getPoisiNimi().split(" ");
        String poisiPere = poisiPereArr[poisiPereArr.length-1];

        String[] tudPereArr = getTüdrukuNimi().split(" ");
        String tudPere = tudPereArr[tudPereArr.length-1];

        return poisiPere + " " + tudPere;
    }

    @Override
    public String toString() {
        return tagastaPerenimed();
    }
}
