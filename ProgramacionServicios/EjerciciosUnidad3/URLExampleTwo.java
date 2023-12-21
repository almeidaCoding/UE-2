package EjerciciosUnidad3;

import java.net.MalformedURLException;
import java.net.URL;

public class URLExampleTwo {
    public static void main(String[] args) {
        mostrarDatos("https://es.wikipedia.org/wiki/Alan_Turing");
        mostrarDatos("http://www.upv.es");
        mostrarDatos("ftp://ftp.acc.umu.se");
    }

    public static void mostrarDatos(String ruta) {
        URL url = null;

        try {
            // Crear una instancia de URL a partir de la cadena de la ruta
            url = new URL(ruta);
        } catch (MalformedURLException ex) {
            // Manejar la excepción si la URL no es válida
            System.out.println("Ruta no accesible");
        }

        // Imprimir información de la URL
        System.out.println(url.toString());
        System.out.println("Protocolo: " + url.getProtocol());
        System.out.println("Nombre del equipo: " + url.getHost());
        System.out.println("Puerto: " + url.getPort() + " Defecto: " + url.getDefaultPort());
        System.out.println("Archivo solicitado: " + url.getFile() + "\n");
    }
}
