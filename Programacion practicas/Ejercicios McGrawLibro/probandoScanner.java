import java.util.Scanner;

public class probandoScanner {
    public static void main(String[] args) {
        Scanner lector1=new Scanner(System.in);
        Scanner lector2=new Scanner(System.in);
        Scanner lector3=new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num=lector1.nextInt();
        System.out.println("El número tecleado es  " + num);

        System.out.println("Introduce una palabra ");
        String palabra=lector2.next();
        System.out.println("La palabra tecleada es " + palabra);
        
        System.out.println("Introduce una frase");
        String frase=lector3.nextLine();
        System.out.println("La frase escrita es: " + frase);

         lector1.close();lector2.close();lector3.close();
        }
}
