package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class startPipelinePrincipal {
    public static void main(String[] args) {
        try {
            // Creamos tres ProcessBuilder para nuestros programas
            ProcessBuilder builder1 = new ProcessBuilder("java", "Ejercicios\\startPipeline1.java");
            ProcessBuilder builder2 = new ProcessBuilder("java", "Ejercicios\\startPipeline2.java");
            ProcessBuilder builder3 = new ProcessBuilder("java", "Ejercicios\\startPipeline3.java");

            // Creamos una lista de ProcessBuilder
            List<ProcessBuilder> builders = List.of(builder1, builder2, builder3);

            // Creamos la tubería de procesos usando startPipeline
            List<Process> processes = ProcessBuilder.startPipeline(builders);

            // Leer la salida del último proceso en la tubería
            Process procesoFinal = processes.get(processes.size() - 1);
            BufferedReader reader = new BufferedReader(new InputStreamReader(procesoFinal.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Esperamos a que todos los procesos terminen
            for (Process process : processes) {
                process.waitFor();
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

















