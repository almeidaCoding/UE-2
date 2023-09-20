import java.util.Scanner;

public class bucleDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String resp; 

        do{
            System.out.println("Ingresa un monto: ");
            // double monto = sc.nextDouble();
            sc.nextLine();
            System.out.println("Desea continuar si o no ?: ");
            resp = sc.nextLine();
        }while(resp.equals("si"));

        sc.close();
    }
}