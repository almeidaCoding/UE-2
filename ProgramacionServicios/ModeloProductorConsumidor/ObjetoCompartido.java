package ModeloProductorConsumidor;

class ObjetoCompartido {
    int valor;
    boolean disponible = false;

    public synchronized int get() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        disponible = false;
        notifyAll();
        return valor;
    }

    public synchronized void set(int vale) {
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        valor = vale;
        disponible = true;
        notifyAll();
    }
}