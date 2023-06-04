package kodu;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestPane {

    public static void main(String[] args) {
        String test = JOptionPane.showInputDialog("tere");
        Map<String, List<String>> map = new HashMap();

        List<String> listike = map.get("test");
    }
}
