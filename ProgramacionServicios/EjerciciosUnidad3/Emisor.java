package EjerciciosUnidad3;

    //Este programa de Emisor va junto con el programa 'Receptor' que se encuentra en esta misma carpeta
    
import java.net.*;

public class Emisor {
    public static void main(String[] args) throws Exception {
        DatagramSocket senderSocket = new DatagramSocket();

        String message = "Hola, receptor!";
        byte[] sendData = message.getBytes();

        InetAddress receiverAddress = InetAddress.getByName("127.0.0.1");
        int receiverPort = 9876;

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receiverAddress, receiverPort);

        senderSocket.send(sendPacket);

        System.out.println("Mensaje enviado: " + message);

        senderSocket.close();
    }
}

