import java.util.Scanner;

public class ejercicioPractico3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double dolar = 0.94;
        System.out.println("Por favor introduzca la cantidad que desea convertir de dólares a euros: ");
        double conversion = sc.nextDouble() * dolar;
        System.out.println("La cantidad que ha introducido en dóalres, es la siguiente en euros: " + conversion);
        sc.close();
    }
}
