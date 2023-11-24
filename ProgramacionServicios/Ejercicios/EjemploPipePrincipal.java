package Ejercicios;

import java.io.*;

public class EjemploPipePrincipal {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "Ejercicios\\EjemploPipeSecundario.java");
            pb.redirectInput(ProcessBuilder.Redirect.PIPE);
            pb.redirectOutput(ProcessBuilder.Redirect.PIPE);

            Process proceso = pb.start();

            // Enviar datos al proceso secundario
            OutputStream outputStream = proceso.getOutputStream();
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream));
            writer.println("Hola desde el programa principal");
            writer.flush();

            // Leer la salida del proceso secundario
            InputStream inputStream = proceso.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println("Salida del proceso secundario: " + linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
