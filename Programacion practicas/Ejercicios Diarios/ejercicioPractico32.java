import java.util.Scanner;

public class ejercicioPractico32 {

// Escribe un programa que obtenga los números enteros comprendidos entre dos
// números introducidos por teclado y validados como distintos, el programa debe
// empezar por el menor de los enteros introducidos e ir incrementando de 7 en
// 7.

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        // Pedir el primer número y validar la entrada
        do {
            System.out.println("Introduce el primer número:");
            num1 = sc.nextInt();
            if (num1 == num2) {
                System.out.println("Los números deben ser distintos. Inténtalo de nuevo.");
            }
        } while (num1 == num2);

        // Pedir el segundo número y validar la entrada
        do {
            System.out.println("Introduce el segundo número:");
            num2 = sc.nextInt();
            if (num2 == num1) {
                System.out.println("Los números deben ser distintos. Inténtalo de nuevo.");
            }
        } while (num2 == num1);

        // Determinar el menor y el mayor número
        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        // Imprimir los números enteros entre el menor y el mayor número,
        // incrementando de 7 en 7.
        for (int i = menor; i <= mayor; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
