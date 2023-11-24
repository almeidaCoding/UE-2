package Ejercicios;

import java.io.*;

public class EjemploPrincipalInherit {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "Ejercicios\\ProgramaSecundarioInherit.java");
            pb.redirectInput(ProcessBuilder.Redirect.INHERIT);
            pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);

            Process proceso = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}