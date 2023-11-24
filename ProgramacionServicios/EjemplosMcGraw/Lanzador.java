import java.io.IOException;

public class Lanzador {
    public static void main(String[] args) {
        try {
            // Definimos un vector de Strings con el comando
            // y los argumentos. En este caso, lanzamos el comando 
            // firefox y una URL como argumento.
            // en caso de que colocar 'firefox' no abra el navegador podemos usar "cmd", "/c", "start" y así se abrirá el navegador predeterminado.
            
            String app[] = {"cmd", "/c", "start", "https://docs.oracle.com/en/java/javase/17/core/process-api1.html"};
            
            // Creamos el ProcessBuilder
            ProcessBuilder pb = new ProcessBuilder(app);

            // Para lanzar el proceso debemos utilizar el método start.
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

















