import java.util.Scanner;

public class ejercicioPractico8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce el primer número para realizar multiplicación: ");
        int userNum1 = sc.nextInt();
        System.out.println("Introduce el segundo número para realizar multiplicación: ");
        int userNum2 = sc.nextInt();

        System.out.println("El resultado de la multiplicación es: " + multiplicación(userNum1, userNum2));

        sc.close();
    }

    public static int multiplicación(int num1, int num2){
        int resultado = num1 * num2;
        return resultado;
    }
}
