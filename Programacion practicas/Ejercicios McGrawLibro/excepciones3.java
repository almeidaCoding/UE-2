import java.util.InputMismatchException;
import java.util.Scanner;

public class excepciones3 {
    public static void main(String[] args) throws IntervalException{
        try(Scanner teclado = new Scanner (System.in);){
            int numero;
            System.out.println("Introduce un número: ");
            numero = teclado.nextInt();

            if(numero < 0 || numero > 100){
                throw new IntervalException("El número debe estar entre 0 y 100");
            }
        }catch(IntervalException e){
            System.out.println("Excepción capturada con el mensaje: " + e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Debes introducir un número");
        }catch(Exception e){
            System.out.println("Excepción genérica");
        }
        
    }
    
}
class IntervalException extends Exception{
    public IntervalException (String message){
        super(message);
    }
}