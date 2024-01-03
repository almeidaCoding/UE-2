package PistasMultideportivasPadel;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class InitPadelCourts {
    public static void main(String[] args) {
        // Crear jugadores
        Players[] players = createPlayers();

        System.out.println("Jugadores que quieren entrar: " + players.length);

        // Crear pistas
        PadelCourts[] courts = createCourts();

        // Esperar a que todos los jugadores terminen
        totalCompletionPlayers(players);

    }

    // Cantidad de jugadores aleatoria que se generará
    public static int playersQuantity() {
        int quantity = (int) (Math.random() * 28) + 1;
        if(quantity > 16){
            System.out.println("Pistas llenas, los jugadores restantes deben esperar");
        }
        return quantity;

        //return (int) (Math.random() * 28) + 1;

    }

    //Creador de pistas
    public static PadelCourts[] createCourts(){
        PadelCourts[] courts = {new PadelCourts(1), new PadelCourts(2), new PadelCourts(3), new PadelCourts(4)};
        return courts;
    }

    //Creador de jugadores
    public static Players[] createPlayers(){
        int numPlayers = playersQuantity();
        Players[] players = new Players[numPlayers];

        for (int i = 0; i < numPlayers; i++) {
            int courtIndex = i / 4;
            PadelCourts[] assignedCourts = createCourts();
            players[i] = new Players(i + 1, assignedCourts);
            players[i].start();
        }
        return players;
    }

    //Espera a que todos los jugadores terminen
    public static void totalCompletionPlayers(Players[] players){
        int numPlayers2 = players.length;

        for (int i = 0; i < numPlayers2; i++) {
            try {
                players[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mostrar el total de ingresos al final del día
        System.out.println("Total de ingresos al final del día: " + Players.getDineroGanado() + " euros");
    }
}