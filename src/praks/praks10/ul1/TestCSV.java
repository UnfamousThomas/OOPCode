package praks.praks10.ul1;

import java.io.IOException;
import java.util.Arrays;

public class TestCSV {

    public static void main(String[] args) throws Exception {
        try (CSVLugeja lugeja = new CSVLugeja("fail.csv")) {
            for (String str : lugeja.loeCSV()) {
                System.out.println(str.replaceAll("\"", ""));
            }
        }
    }
}
