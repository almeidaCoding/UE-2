import java.util.Scanner;

public class ejercicioPractico9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce el primer número: ");
        int numeroUser1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int numeroUser2 = sc.nextInt();

        System.out.println("La multuplicación de tus números es la siguiente: " + multiplicacion(numeroUser1, numeroUser2) + "\nLa division de tus números es la siguiente: " + division(numeroUser1, numeroUser2) + "\nLa suma de tus números es la siguiente: " + suma(numeroUser1, numeroUser2) + "\nLa resta de tus números es la siguiente: " + resta(numeroUser1, numeroUser2));

        sc.close();
    }

    public static int multiplicacion(int num1, int num2){
        return num1 * num2;

    }
    public static int division(int num1, int num2){
        return num1 / num2;

    }
    public static int suma(int num1, int num2){
        return num1 + num2;

    }
    public static int resta(int num1, int num2){
        return num1 - num2;

    }
    
}


