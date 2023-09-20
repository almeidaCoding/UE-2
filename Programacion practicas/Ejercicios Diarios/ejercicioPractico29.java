import java.util.Scanner;

public class ejercicioPractico29 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int suma = 0;
        int contador = 0;

        while(true){
            System.out.println("Introduce un número");
            int numUser = sc.nextInt();

            if(numUser < 0){
                break;
            }

            suma += numUser;
            contador++;

            if(contador > 0){
                double media = (double) suma / contador;
                System.out.println("La media es: " + media);
            }else{
                System.out.println("Los números no son válidos");
            }
            
        }
        sc.close();

    }
}
