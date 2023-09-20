import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicioPractico34 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int numeroMayor = 0;
        int numUser = 0;
        int intentos = 0;

        while(intentos < 6){
            System.out.println("Introduce un número entero: ");

            try{
                numUser = sc.nextInt();
                if(numUser > numeroMayor){
                    numeroMayor = numUser;
                }
                intentos++;
            }catch(InputMismatchException e){
                System.out.println("Tienes que introducir un número entero, vuelve a intentarlo");
                sc.nextLine();
            }
        }
        System.out.println("El número mayor de los que has introducido es: " + numeroMayor);
        sc.close();
    }
}
