package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class startPipeline2 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            System.out.println("Programa 2 recibio: " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
