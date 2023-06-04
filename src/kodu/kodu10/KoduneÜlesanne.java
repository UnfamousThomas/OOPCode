package kodu.kodu10;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/**
 * @author thomp (17/04/2023)
 */
public class KoduneÜlesanne {
    LocalDate tähtaeg;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public KoduneÜlesanne(LocalDate localDate) {
        setTähtaeg(localDate);
    }

    public void setTähtaeg(LocalDate tähtaeg) {
        if(tähtaeg.getDayOfWeek() == DayOfWeek.SATURDAY || tähtaeg.getDayOfWeek() == DayOfWeek.SUNDAY) {
            throw new IllegalArgumentException(tähtaeg.format(dtf) + " ei sobi!");
        } else {
            this.tähtaeg = tähtaeg;
        }
    }
    
    public LocalDate getTähtaeg() {
        return tähtaeg;
    }

    public static void main(String[] args) {
        KoduneÜlesanne k1 = new KoduneÜlesanne(LocalDate.now());
        KoduneÜlesanne k2 = new KoduneÜlesanne(LocalDate.now().plusDays(6));
    }
}
