import java.util.Scanner;

public class edadUsuario {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        
        int edad;
        
        System.out.println("Introduce tu edad: ");
        edad = teclado.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Tienes prohibido el acceso"); 
        }

        teclado.close();
    }
}
