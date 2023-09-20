import java.util.Random;
import java.util.Scanner;

public class ejercicioPractico37 {
    public static void main(String[] args) {
        Random numAleatorio = new Random();
        int numGenerado = numAleatorio.nextInt(100)+1;
        int contador = 10;
        int numUser;

        Scanner sc = new Scanner(System.in);
        System.out.println("Se ha generado un numero aleatorio entre 1 y 100. Intente adivinarlo. " + "\nTienes " + contador + " intentos");

        do{
            System.out.println("Introduce un número: ");
            numUser = sc.nextInt();
            if(numUser > numGenerado){
                System.out.println("El número que has introducido es mayor al que estas buscando. Te quedan " + (contador-1) + " intentos");
            }else if(numUser < numGenerado){
                System.out.println("El número que has introducido es menor al que estas buscando. Sigue intentando. Te quedan " + (contador-1) + " intentos");
            }else{
                System.out.println("Has acertado el número, has necesitado " + (10 - (contador-1)) + " intentos.");
            }
            contador--;
        }while(numUser != numGenerado && contador > 0);

        if(contador == 0){
            System.out.println("Has perdido. El número aleatorio era " + numGenerado);
        }
        sc.close();
    }
}