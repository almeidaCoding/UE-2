package EjerciciosUnidad3;

import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URLExample {

    public static void main(String[] args) {
        try {
            // Crear una URL
            URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");

            // Obtener una conexión a la URL
            URLConnection connection = url.openConnection();

            // Obtener un InputStream para leer desde la conexión
            InputStream inputStream = connection.getInputStream();

            // Leer los datos desde el InputStream
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            reader.close();

            // Imprimir el contenido obtenido de la URL
            System.out.println("Contenido de la URL:");
            System.out.println(content.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
