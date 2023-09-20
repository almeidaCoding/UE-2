import java.util.Scanner;
import javax.swing.*;

public class ClaseScannerJPane {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce tu nombre: ");
        String nombreUser = sc.nextLine();
        System.out.println("Introduce tu edad: ");
        int edadUser = sc.nextInt();

        System.out.println("Hola " + nombreUser + "\nEl año que viene tendras " + (edadUser+1) + " años.");
        sc.close();

        String nombreUser2 = JOptionPane.showInputDialog("Introduce tu nombre por favor:");
        String edadUserTwo = JOptionPane.showInputDialog("Introduce tu edad por favor:");
        int edadUsuario = Integer.parseInt(edadUserTwo);
        edadUsuario++;
        System.out.println("Hola " + nombreUser2 + "\nEl año que viene tendras " + edadUsuario + " años.");
        

    }
}
