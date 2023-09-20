import java.util.Scanner;

public class ejercicioPractico28 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número: ");
        int numUser = sc.nextInt();

        System.out.println("La tabla de multiplicar del número que has introducido es:\n");
        for(int i = 1; i <= 10; i++){
            System.out.println(numUser + " x " + i + " = " + (numUser*i));
        }
        sc.close();
    }
}
