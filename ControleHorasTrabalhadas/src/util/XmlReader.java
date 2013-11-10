package util;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class XmlReader {

    public ArrayList<String> listaFeriados() {

        ArrayList<String> lista = new ArrayList<String>();

        try {

            File fXmlFile = new File("db/feriados.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("feriado");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    lista.add(eElement.getElementsByTagName("data").item(0).getTextContent());
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Arquivo de registro de feriados inválido!\n " + e.getMessage()+"\nMais Informações em Home/wiki/Feriados");
            return null;
        }
        return lista;
    }

    public static void main(String args[]) {

        ArrayList<String> lista = new XmlReader().listaFeriados();

        for (String str : lista) {
            System.out.println(str);
        }


    }
}