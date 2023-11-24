package Ejercicios;

import java.io.*;

public class EjemploPipeSecundario {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            System.out.println("Mensaje recibido: " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}