package PistasMultideportivas;

import java.util.concurrent.Semaphore;

public class Jugadores extends Thread{
    private static final int NUM_PISTAS = 4;
    private static final int COSTO_PARTIDA = 5;
    private static volatile int dineroGenerado = 0;

    private static Semaphore semaphorePistas = new Semaphore(NUM_PISTAS, true);
    private static Semaphore semaphoreDinero = new Semaphore(1, true);

    
    public void run(){
        try {
            // Adquirir un permiso del semáforo de pistas
            System.out.println("Jugador en pista...");
            semaphorePistas.acquire();

            // Simulación de tiempo jugando en la pista
            Thread.sleep(2000);

            // Actualizar dinero ganado
            semaphoreDinero.acquire();
            dineroGenerado += COSTO_PARTIDA;
            semaphoreDinero.release();
            
            //Jugador liberando permiso de pista
            System.out.println("Jugador saliendo de la pista...");
            semaphorePistas.release();
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int getDineroGenerado() {
        return dineroGenerado;
    }
}
