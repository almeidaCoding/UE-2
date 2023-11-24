package Ejercicios;

import java.io.*;

public class PruebaMyProgram {
    public static void main(String[] args) {
            File outputFile = new File("C:\\Users\\chpal\\OneDrive\\Escritorio\\Código\\ProgramacionServicios\\Ejercicios\\input.txt");
            ProcessBuilder processBuilder = new ProcessBuilder("java", "Ejercicios\\MyProgram.java");
            processBuilder.redirectOutput(outputFile);

        try {
            Process process = processBuilder.start();

            // Realizar operaciones de entrada/salida con el proceso
            InputStream inputStream = process.getInputStream();
            OutputStream outputStream = process.getOutputStream();

            // Enviar datos al proceso
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream));
            writer.println("5"); // Envía un número al proceso, por ejemplo, 5
            writer.flush(); // Asegura que los datos se envíen

            // Leer la salida del proceso
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Salida del proceso: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



