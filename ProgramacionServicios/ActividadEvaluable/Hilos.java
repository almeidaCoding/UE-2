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

class NumerosPares implements Runnable{

    int sumaPares = 0;

    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Número par: " + i);
            sumaPares += i;
        }
    }

    public String getSumaPares (){
        return "La suma total de los números pares es: " + sumaPares;
    }
    
}

class NumerosImpares implements Runnable{

    int sumaImpares = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Número impar: " + i);
            sumaImpares += i;
        }
    }

    public String getSumaImpares (){
        return "La suma total de los número impares es: " + sumaImpares;
    }
    
}