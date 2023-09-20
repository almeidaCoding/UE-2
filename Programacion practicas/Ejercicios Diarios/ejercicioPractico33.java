import java.util.Scanner;

public class ejercicioPractico33 {
//     Realiza un programa que vaya pidiendo números hasta que se introduzca un
// numero negativo y nos diga cuantos números se han introducido, la media de
// los impares y el mayor de los pares. El número negativo sólo se utiliza para
// indicar el final de la introducción de datos pero no se incluye en el cómputo.

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int sumaImpares = 0;
        int mayorPar = 0;
        int contador = 0;
        double media = 0;
        
        while(true){
            System.out.println("Introduce un número");
            int numeroUser = sc.nextInt();

            if(numeroUser < 0){
                System.out.println("Fuera del programa, adios!");
                break;
            }

            if(numeroUser % 2 != 0){
                sumaImpares += numeroUser;
                contador++;
                media = (double) sumaImpares / contador;
            }

            if(numeroUser % 2 == 0){
                if(numeroUser > mayorPar){
                    mayorPar = numeroUser;
                }
            }
        }
        System.out.println("La media de los impares es: " + media);
        System.out.println("El número mayor de los pares es: " + mayorPar);
        sc.close();
    }
}
