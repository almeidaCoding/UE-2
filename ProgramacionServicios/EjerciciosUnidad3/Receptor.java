package EjerciciosUnidad3;

//Este programa de Receptor va junto con el programa 'Emisor' que se encuentra en esta misma carpeta

import java.net.*;

public class Receptor {
    public static void main(String[] args) throws Exception {
        DatagramSocket receiverSocket = new DatagramSocket(9876);

        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        receiverSocket.receive(receivePacket);

        String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());

        System.out.println("Mensaje recibido: " + receivedMessage);

        receiverSocket.close();
    }
}