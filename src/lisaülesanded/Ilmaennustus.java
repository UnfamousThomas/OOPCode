package lisaülesanded;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Ilmaennustus {
    Document doc;

    public Ilmaennustus(File fail) throws Exception {
        InputStream inputStream = new FileInputStream(fail);
        this.doc = hangiDokument(inputStream);
        inputStream.close();
    }

    public Ilmaennustus(URL url) throws Exception {
        InputStream inputStream = url.openStream();
        this.doc = hangiDokument(inputStream);
        inputStream.close();
    }

    public String päevaEnnustus(String kuupäev) {
        Element root = doc.getDocumentElement();
        NodeList päevad = root.getElementsByTagName("day");
        for (int i = 0; i < päevad.getLength(); i++) {
            Element päev = (Element) päevad.item(i);
            String date = päev.getParentNode().getAttributes().getNamedItem("date").getNodeValue();
            if (kuupäev.equals(date)) {
                Node textNode = päev.getElementsByTagName("text").item(0);
                return textNode.getTextContent().trim();
            }
        }
        throw new RuntimeException("Sellist päeva polnud failis");
    }

    private Document hangiDokument(InputStream inputStream) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            return dBuilder.parse(inputStream);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            System.out.println("Midagi läks valesti dokumeendi saamisel. Proovi uuesti.");
        }

        return null;
    }

    public static void main(String[] args) throws Exception {
        Ilmaennustus ilmaennustus = new Ilmaennustus(new URL("https://www.ilmateenistus.ee/ilma_andmed/xml/forecast.php"));
        System.out.println(ilmaennustus.päevaEnnustus("2023-05-01"));
    }
}
