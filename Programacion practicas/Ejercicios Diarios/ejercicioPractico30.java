import java.util.Scanner;

public class ejercicioPractico30 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int numUser = 0;
        int positivos = 0;
        int negativos = 0;

        while(numUser < 10){
            System.out.println("Introduce un número");
            numUser = sc.nextInt();

            

            if(numUser < 0){
                positivos++;
            }else if (numUser > 0){
                negativos++;
            }else{
                System.out.println("Datos errados");
            }
        }

        System.out.println("El número de números positivos es: " + positivos);
        System.out.println("El número de números negativos es: " + negativos);
        sc.close();
    }   
}
