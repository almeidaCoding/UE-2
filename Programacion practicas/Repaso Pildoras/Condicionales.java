import java.util.*;
// import javax.swing.JOptionPane;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Inicio condicionales IFELSE
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        if(edad < 18){
            System.out.println("Eres un adoslecente");
        }else if(edad < 40){
            System.out.println("Eres jóven");
        }else if(edad < 65){
            System.out.println("Eres maduro");
        }else{
            System.out.println("Cuidate!");
        }
        // Fin condicionales IFELSE

        // Inicio condiciales SWITCH
        System.out.println("Elige una opción:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("4. Círculo");
        int figura = sc.nextInt();

        switch(figura){
            case 1:
                // El JOptionPane no funciona junto con el Scanner.
                // int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                System.out.println("Introduce el lado");
                int lado = sc.nextInt();
                System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
            break;
            case 2:
                // int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                // int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("Introduce la base");
                int base = sc.nextInt();
                System.out.println("Introduce la altura");
                int altura = sc.nextInt();
                System.out.println("El área del rectángulo es: " + base*altura);
            break;
            case 3:
                System.out.println("Introduce la base");
                base = sc.nextInt();
                System.out.println("Introduce la altura");
                altura = sc.nextInt();
                System.out.println("El área del triángulo es: " + (base*altura)/2);  
            break;
            case 4:
                System.out.println("Introduce el radio");
                int radio = sc.nextInt();
                System.out.print("El área del círculo es: ");
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
            break;
            default:
                System.out.println("La opción seleccionada no es correcta.");
        }
        sc.close();
    }
}
