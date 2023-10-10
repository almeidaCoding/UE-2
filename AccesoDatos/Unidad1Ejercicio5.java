package AccesoDatos;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import java.io.File;
import java.io.StringWriter;

public class Unidad1Ejercicio5 {
    public static void main(String[] args) {
        try {
            // Crear una instancia de DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            
            // Crear un DocumentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Especificar la ruta al archivo XML local
            File xmlFile = new File("C:\\Users\\chpal\\OneDrive\\Escritorio\\Código\\UE-1\\Lenguajes de marca\\XML\\ejercicio1.xml");
            
            // Parsear el archivo XML y obtener un objeto Document
            Document document = builder.parse(xmlFile);

            // Imprimir contenido del documento XML
            String xmlContent = documentToString(document);
            System.out.println("Contenido del documento XML:");
            System.out.println(xmlContent);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String documentToString(Document document) throws TransformerException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        StringWriter writer = new StringWriter();
        transformer.transform(new DOMSource(document), new StreamResult(writer));
        return writer.getBuffer().toString();
    }
}
