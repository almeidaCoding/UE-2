package PistasMultideportivas;

public class AccesoPistas {
    public static void main(String[] args) {

        Jugadores [] jugadores = new Jugadores[10];
        for(int i = 0; i < jugadores.length; i++){
            jugadores[i] = new Jugadores();
        }

        for(Jugadores jugador : jugadores){
            jugador.start();
        }

        for(Jugadores jugador : jugadores){
            try {
                jugador.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Dinero ganado al final del día: " + Jugadores.getDineroGenerado() + "euros");
    }
}
