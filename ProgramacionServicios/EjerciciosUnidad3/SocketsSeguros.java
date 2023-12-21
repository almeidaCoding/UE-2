package EjerciciosUnidad3;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SocketsSeguros {
    public static void main(String[] args) {
        try {
            // Crear instancia del MessageDigest con el algoritmo MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Texto a resumir
            String texto = "Hola, esto es un ejemplo.";

            // Calcular el resumen
            byte[] resumen = md.digest(texto.getBytes());

            // Convertir el resumen a hexadecimal
            StringBuilder resumenHex = new StringBuilder();
            for (byte b : resumen) {
                resumenHex.append(String.format("%02x", b));
            }

            // Imprimir el resumen en hexadecimal
            System.out.println("Resumen MD5: " + resumenHex.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}

