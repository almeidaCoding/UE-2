package ActividadEvaluable;

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