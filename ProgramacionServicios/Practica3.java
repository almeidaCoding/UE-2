import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroUno, numeroDos;

        System.out.println("Introduce un primer número: ");
        numeroUno = sc.nextInt();
        System.out.println("Introduce un segundo número: ");
        numeroDos = sc.nextInt();

        System.out.println("\nNúmeros enteros aleatorios entre los dos números introducidos:\n");
        numAleatorio(numeroUno, numeroDos);

        sc.close();
        
    }
    public static int numAleatorio(int a, int b){
        int randomNumber = 0;
        for(int i = 0; i < 10; i++){
            randomNumber = (int) (Math.random() * (b - a + 1)) + a;
            System.out.println("Número " + randomNumber);
            
        }
        return randomNumber;
    }
}