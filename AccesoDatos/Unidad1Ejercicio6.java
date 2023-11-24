import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Unidad1Ejercicio6 {
    public static void main(String[] args) {
        try {
            // Cargar el archivo XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            File fileXml = new File("C:\\Users\\chpal\\OneDrive\\Escritorio\\Código\\UE2\\AccesoDatos\\Unidad1Ej6.xml");
            Document document = builder.parse(fileXml);

            // Obtener la raíz del documento
            Element raiz = document.getDocumentElement();

            // Continúa con el procesamiento de los nodos como en tu código original
            NodeList modulos = raiz.getElementsByTagName("modulo");

            for (int i = 0; i < modulos.getLength(); i++) {
                Element el = (Element) modulos.item(i);
                System.out.println(el.getNodeName() + " " + (i + 1));
                System.out.println("Nombre: " + el.getElementsByTagName("nombre").item(0).getFirstChild().getNodeValue());
                System.out.println("Horas: " + el.getElementsByTagName("horas").item(0).getFirstChild().getNodeValue());
                System.out.println("Nota: " + el.getElementsByTagName("nota").item(0).getFirstChild().getTextContent());
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}