package Ejercicios;

import java.io.IOException;

public class EjemploPrincipalDiscard {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "Ejercicios\\EjemploSecundarioDiscard.java");
            pb.redirectOutput(ProcessBuilder.Redirect.DISCARD);

            Process proceso = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}