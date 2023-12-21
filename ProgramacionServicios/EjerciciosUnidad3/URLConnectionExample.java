package EjerciciosUnidad3;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class URLConnectionExample {

    public static void main(String[] args) {
        try {
            // Crear una instancia de URL
            URL url = new URL("https://www.google.com");

            // Obtener una conexión URLConnection
            URLConnection connection = url.openConnection();

            // Obtener información de la cabecera
            String contentType = connection.getHeaderField("Content-Type");
            System.out.println("Content-Type: " + contentType + "\n");

            // Obtener todos los campos de la cabecera
            Map<String, List<String>> headerFields = connection.getHeaderFields();
            System.out.println("Header Fields: " + headerFields + "\n");

            // Obtener un stream de entrada para leer el contenido
            InputStream inputStream = connection.getInputStream();
            // Leer el contenido del stream según el tipo de datos (depende de Content-Type)
            // ...

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
