import java.util.Scanner;

public class excepciones{
    public static void main(String[] args) throws IntervalException {
        Scanner teclado = new Scanner(System.in);

        int numero;
        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();
        teclado.close();

        try{
            if(numero < 0 || numero > 100){
                throw new IntervalException("El número debe estar entre 0 y 100");
            }
        }catch(IntervalException e){
            System.out.println("Excepción capturada con el mensaje " + e.getMessage());
            System.out.println("Volcado de pila");
            e.printStackTrace();
        }finally{
            System.out.println("Aquí la cláusula Finally que solo muestra este mensaje");
        }

    }
}
class IntervalException extends Exception{
    public IntervalException (String message){
        super(message);
    }
}