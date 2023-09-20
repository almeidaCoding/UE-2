import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        
        int aleatorio = (int)(Math.random()*100);
        Scanner sc = new Scanner (System.in);
        int numero = 0;
        int intentos = 0;
        while(numero != aleatorio){
            intentos++;
            System.out.println("Introduce un número por favor");
            numero = sc.nextInt();

            if(aleatorio < numero){
                System.out.println("El número que se ha generado es menor que el introducido");
            }else if (aleatorio > numero){
                System.out.println("El número que se ha generado es mayor que el introducido");
            }
        }
        System.out.println("Número adivinado, lo has conseguido en " + intentos + " intentos");
        sc.close();
    }
}
