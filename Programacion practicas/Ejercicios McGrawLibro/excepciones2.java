import java.util.InputMismatchException;
import java.util.Scanner;

public class excepciones2 {
    public static void main(String[] args) throws IntervalException{
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        boolean repetir = true;

        do {
            try {
                System.out.print("Introduce un número: ");
                numero = teclado.nextInt();
                repetir = false;
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número");
                teclado.next();
            }
        } while (repetir);

    }
}
 class IntervalException extends Exception{
    public IntervalException (String message){
        super(message);
    }
}