package praks.praks10.ul1;

public class Fraas {
    private String fraas;
    private String tagurpidi;

    public Fraas(String fraas) throws PalindroomiErind {
        StringBuilder sb = new StringBuilder();
        sb.append(fraas);
        String tagurpidi = sb.reverse().toString();
        if(tagurpidi.equals(fraas)) throw new PalindroomiErind(fraas, tagurpidi);
        this.fraas = fraas;
        this.tagurpidi = tagurpidi;
    }


    @Override
    public String toString() {
        return "Fraas: " + fraas + "; Tagurpidi: " + tagurpidi;
    }
}
