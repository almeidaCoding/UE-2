package ModeloProductorConsumidor;

class Productor implements Runnable {
    ObjetoCompartido compartido;

    Productor(ObjetoCompartido compartido) {
        this.compartido = compartido;
    }

    @Override
    public void run() {
        for (int y = 0; y < 5; y++) {
            System.out.println("El productor produce: " + y);
            compartido.set(y);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
