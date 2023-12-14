package ModeloProductorConsumidor;

class Consumidor implements Runnable {
    private ObjetoCompartido compartido;

    Consumidor(ObjetoCompartido compartido) {
        this.compartido = compartido;
    }

    @Override
    public void run() {
        for (int y = 0; y < 5; y++) {
            System.out.println("El consumidor consume: " + compartido.get());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}
