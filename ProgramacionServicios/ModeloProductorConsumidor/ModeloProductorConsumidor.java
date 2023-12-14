package ModeloProductorConsumidor;

public class ModeloProductorConsumidor {
    public static void main(String[] args) {
        ObjetoCompartido compartido = new ObjetoCompartido();
        Thread p = new Thread(new Productor(compartido));
        Thread c = new Thread(new Consumidor(compartido));
        p.start();
        c.start();
    }
}
