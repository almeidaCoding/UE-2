package PistasMultideportivas;

public class AccesoPistas {
    public static void main(String[] args) {
        getAccesoPistas();
    }

    public static void getAccesoPistas() {
        int cantidadJugadores = generarCantidadJugadores();
        

        if (cantidadJugadores >= 16) {
            System.out.println("Ya hay 16 jugadores en pista, todas las pistas están ocupadas");
        }

        Jugadores[] jugadores = crearJugadores(cantidadJugadores, 16);

        iniciarJugadores(jugadores);

        /*esperarUnTiempo(2000);*/

        if (cantidadJugadores > 16) {
            System.out.println("Los jugadores que estaban esperando ahora pueden entrar.");
            Jugadores[] jugadoresEnEspera = crearJugadores(cantidadJugadores - 16, 4);
            iniciarJugadores(jugadoresEnEspera);
            /*esperarJugadoresTerminen(jugadoresEnEspera)*/;
        }
        esperarJugadoresTerminen(jugadores);
        mostrarDineroGanado(jugadores);
    }

    public static int generarCantidadJugadores() {
        int cantidadGenerada = (int) (Math.random() * 28) + 1;
        System.out.println("Jugadores que quieren entrar: " + cantidadGenerada);
        return cantidadGenerada;
        
    }

    public static Jugadores[] crearJugadores(int cantidad, int maximo) {
        Jugadores[] jugadores = new Jugadores[Math.min(cantidad, maximo)];
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugadores(i);
        }
        return jugadores;
    }

    public static void iniciarJugadores(Jugadores[] jugadores) {
        for (Jugadores jugador : jugadores) {
            jugador.start();
        }
    }

    public static void esperarJugadoresTerminen(Jugadores[] jugadores) {
        for (Jugadores jugador : jugadores) {
            try {
                jugador.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void esperarUnTiempo(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void mostrarDineroGanado(Jugadores[] jugadores) {
        System.out.println("\nDinero ganado al final del día: " + Jugadores.getDineroGenerado() + " euros");
    }
}
