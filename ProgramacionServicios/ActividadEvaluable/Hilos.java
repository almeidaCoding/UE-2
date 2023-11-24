package ActividadEvaluable;

/* Realiza un programa en java que use hilos independientes, en clases diferentes. Un hilo imprime
números pares del 1 al 10 y la suma de dichos números, y otro hilo que imprime números
impares del 1 al 10 y la suma de dichos números. Cree dos instancias (hilos) de cada uno y
muestre la salida */

public class Hilos {
    public static void main(String[] args) {

        NumerosPares numPar = new NumerosPares();
        Thread hilo1 = new Thread(numPar);

        NumerosImpares numImpar = new NumerosImpares();
        Thread hilo2 = new Thread(numImpar);

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(numPar.getSumaPares());
        System.out.println(numImpar.getSumaImpares());

    }
}