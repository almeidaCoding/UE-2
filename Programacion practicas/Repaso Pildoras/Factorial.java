import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);


        System.out.println("Introduce un número");
        int resultado = 1;
        int numero = sc.nextInt();

        for(int i = numero; i > 0; i--){
            resultado = resultado*i;
        }
        System.out.println("El factorial de " + numero + " es: " + resultado);
        sc.close();
    }
}
