package CarreraGalgos;

import java.util.Scanner;

public class CarreraDeGalgos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tiempo de carrera para los galgos (en milisegundos):");
        int tiempoCarrera = scanner.nextInt();

        Galgos galgo1 = new Galgos(tiempoCarrera);
        Galgos galgo2 = new Galgos(tiempoCarrera);

        Thread hilo1 = new Thread(galgo1);
        Thread hilo2 = new Thread(galgo2);

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        if (galgo1.getTiempoLlegada() < galgo2.getTiempoLlegada()) {
            System.out.println("¡Galgo #" + galgo1.getNumeroGalgo() + " llegó primero!");
            System.out.println("¡Galgo #" + galgo2.getNumeroGalgo() + " llegó segundo!");
        } else {
            System.out.println("¡Galgo #" + galgo2.getNumeroGalgo() + " llegó primero!");
            System.out.println("¡Galgo #" + galgo1.getNumeroGalgo() + " llegó segundo!");
        }

        scanner.close();
    }
}