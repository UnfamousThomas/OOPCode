package praks.praks5.ex2;

import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Scanner;

public class TestFail {
    public static void main(String[] args) throws RuntimeException, IOException {
        System.out.println("Sisesta kaust");
        Scanner scanner = new Scanner(System.in);
        String teekond = scanner.nextLine();
        Path path = Path.of(teekond);

        if(Files.isDirectory(path)) {
            FailiVaatleja failiVaatleja = new FailiVaatleja();
            Files.walkFileTree(path, failiVaatleja);
            Collections.sort(failiVaatleja.getFailiNimed(), new NimeVõrdleja());
            for (String s : failiVaatleja.getFailiNimed()) {
                System.out.println(s);
            }
        } else {
            throw new RuntimeException("Error: Path ei ole kaust.");
        }
    }
}
