import java.util.Scanner;

public class ejercicioPractico27 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número");
        int numUser = sc.nextInt();

        int i = 1;
        System.out.println("La tabla de multiplicar del número que has introducido es:\n");
        while(i <= 10){
            System.out.println(numUser + " x " + i + " = " + (numUser*i));
            i++;
        }
        sc.close();

    }
}
