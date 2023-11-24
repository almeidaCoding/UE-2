package ActividadEvaluable;

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