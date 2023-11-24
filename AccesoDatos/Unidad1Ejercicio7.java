import java.io.FileOutputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Unidad1Ejercicio7 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document documento = docBuilder.newDocument();
            Element root = documento.createElement("curso");

            root.setAttribute("nivel", "2");
            root.setAttribute("ciclo", "DAM");
            documento.appendChild(root);

            Element modulo = documento.createElement("modulo");
            root.appendChild(modulo);
            Element nombre = documento.createElement("nombre");
            nombre.appendChild(documento.createTextNode("Acceso a datos"));
            nombre.setAttribute("curso", "2");
            modulo.appendChild(nombre);

            Transformer trns = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(documento);
            StreamResult result = new StreamResult(new FileOutputStream("pruebaEjercicio7.xml"));
            trns.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


