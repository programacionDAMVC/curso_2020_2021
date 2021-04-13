package teoria.ficherosXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejemplo1 {
    public static void main(String[] args) {
        List<Coche> listaCoches = new ArrayList<>();
        File file = new File("INPUT_FILES/coches.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("coche");
            System.out.printf("Número de coches: %d%n", nList.getLength());
            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElemento = (Element) node;
                    /*System.out.printf("Coche id: %s\t", eElemento.getAttribute("id"));
                    System.out.printf("Marca: %s\t",
                            eElemento.getElementsByTagName("marca").item(0).getTextContent());
                    System.out.printf("Modelo: %s\t",
                            eElemento.getElementsByTagName("modelo").item(0).getTextContent());
                    System.out.printf("Cilindrada: %s\n",
                            eElemento.getElementsByTagName("cilindrada").item(0).getTextContent());*/
                    listaCoches.add(new Coche(eElemento.getElementsByTagName("marca").item(0).getTextContent(),
                            eElemento.getElementsByTagName("modelo").item(0).getTextContent(),
                            Double.parseDouble(eElemento.getElementsByTagName("cilindrada").item(0).getTextContent())));
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        listaCoches.forEach(System.out::println);

    }
}
