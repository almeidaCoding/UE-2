package EjerciciosUnidad3;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EjemploCifradoAES {

    public static void main(String[] args) throws Exception {
        // Generar una clave AES
        SecretKey clave = generarClaveAES();

        // Mensaje a encriptar
        String mensajeOriginal = "Hola, esto es un ejemplo de cifrado AES.";

        // Encriptar el mensaje
        String mensajeEncriptado = encriptarAES(mensajeOriginal, clave);
        System.out.println("Mensaje Encriptado: " + mensajeEncriptado);

        // Desencriptar el mensaje
        String mensajeDesencriptado = desencriptarAES(mensajeEncriptado, clave);
        System.out.println("Mensaje Desencriptado: " + mensajeDesencriptado);
    }

    // Método para generar una clave AES
    private static SecretKey generarClaveAES() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); // Tamaño de clave: 128 bits
        return keyGenerator.generateKey();
    }

    // Método para encriptar con AES
    private static String encriptarAES(String mensaje, SecretKey clave) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, clave);
        byte[] bytesEncriptados = cipher.doFinal(mensaje.getBytes());
        return Base64.getEncoder().encodeToString(bytesEncriptados);
    }

    // Método para desencriptar con AES
    private static String desencriptarAES(String mensajeEncriptado, SecretKey clave) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, clave);
        byte[] bytesDesencriptados = cipher.doFinal(Base64.getDecoder().decode(mensajeEncriptado));
        return new String(bytesDesencriptados);
    }
}

