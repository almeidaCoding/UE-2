package Ejercicios;

import java.io.*;

public class MyProgram {
    public static void main(String[] args) {
        try {
            // Lee un número entero de la entrada estándar
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero: ");
            String input = reader.readLine();
            int number = Integer.parseInt(input);

            // Realiza algún cálculo (por ejemplo, duplica el número)
            int result = number * 2;

            // Envía el resultado a la salida estándar
            System.out.println("El resultado es: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}