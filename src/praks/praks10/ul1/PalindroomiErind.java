package praks.praks10.ul1;

public class PalindroomiErind extends RuntimeException{
    public PalindroomiErind(String s, String sTagur) {
        super("Fraasi " + s + " puhul on tegu palindroomiga: " + sTagur);
    }
}
