package PistasMultideportivas;

import java.util.concurrent.Semaphore;

public class Jugadores extends Thread{
    private static final int COSTO_PARTIDA = 5;
    private static volatile int dineroGenerado = 0;
    private static Semaphore[] semaphorePistas = {new Semaphore(4), new Semaphore(4), new Semaphore(4), new Semaphore(4)};
    private int id;

    public Jugadores(int id) {
            this.id = id;
    }
    
    public void run(){
        try {
            // Adquirir un permiso del semáforo de pistas
            int pistas = (int) (Math.random() * 4);
            semaphorePistas[pistas].acquire();
            System.out.println("Jugador " + id + " ha reservado la pista " + pistas);
            /*semaphorePistas.acquire();*/

            // Simulación de tiempo jugando en la pista
            Thread.sleep((long) (Math.random() * 1000) + 100);

            // Actualizar dinero ganado
            System.out.println("Jugador " + id + " ha pagado " + COSTO_PARTIDA + " euros.");
            dineroGenerado += COSTO_PARTIDA;
            
            
            //Jugador liberando permiso de pista
            semaphorePistas[pistas].release();
            System.out.println("Jugador " + id + " ha liberado la pista " + pistas);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int getDineroGenerado() {
        return dineroGenerado;
    }
}





