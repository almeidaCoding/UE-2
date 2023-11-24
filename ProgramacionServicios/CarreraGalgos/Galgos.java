package CarreraGalgos;


class Galgos implements Runnable {
    private static int contadorGalgos = 0;
    private final int numeroGalgo;
    private final int tiempoCarrera;
    private long tiempoLlegada;

    public Galgos(int tiempoCarrera) {
        this.numeroGalgo = contadorGalgos++;
        this.tiempoCarrera = tiempoCarrera;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(tiempoCarrera);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tiempoLlegada = System.currentTimeMillis();

        System.out.println("¡Galgo #" + numeroGalgo + " ha terminado!");
    }

    public long getTiempoLlegada() {
        return tiempoLlegada;
    }

    public int getNumeroGalgo() {
        return numeroGalgo;
    }
}