import java.util.Scanner;

public class ejercicioPractico2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        double euro = 1.07;
        System.out.println("Por favor introduzca la cantidad que desea convertir de euros a dólares: ");
        double conversion = sc.nextDouble() * euro;
        System.out.println("La cantidad que ha introducido en euros, es la siguiente en dolares: " + conversion);
        sc.close();
    }
}
