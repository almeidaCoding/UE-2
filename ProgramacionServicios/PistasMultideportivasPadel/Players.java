package PistasMultideportivasPadel;

import java.util.concurrent.Semaphore;

public class Players extends Thread{
    private int idPlayers;
    private static final int COSTO_PARTIDO = 5;
    private static int dineroGanado = 0;
    private PadelCourts[] assignedCourts;

    public Players(int idPlayers, PadelCourts[] padelCourts){
        this.idPlayers = idPlayers;
        this.assignedCourts = padelCourts;
    }

    public void run(){
        try {
            PadelCourts.semaphores[idPlayers % PadelCourts.semaphores.length].acquire();
            System.out.println("Jugador " + idPlayers + " está jugando en la pista " + (idPlayers % PadelCourts.semaphores.length+1));

            Thread.sleep(2000); // Simulación de la duración del partido

            System.out.println("Jugador " + idPlayers + " ha pagado " + COSTO_PARTIDO + " euros.");
            dineroGanado += COSTO_PARTIDO;

            System.out.println("Jugador " + idPlayers + " ha abandonado la pista " + (idPlayers % PadelCourts.semaphores.length+1));
            PadelCourts.semaphores[idPlayers % PadelCourts.semaphores.length].release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static int getDineroGanado() {
        return dineroGanado;
    }
}
