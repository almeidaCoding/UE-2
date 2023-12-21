package EjerciciosUnidad3;

import java.net.InetAddress;
import java.io.IOException;

public class InetAddressExample {

    public static void main(String[] args) {
        try {
            
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("El nombre del Host es: " + address.getHostName());
            System.out.println("La dirección del Host es: " + address.getHostAddress());
            Boolean isRecheable = address.isReachable(1000);
            System.out.println("Es Recheable: " + isRecheable);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
