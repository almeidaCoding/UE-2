import java.util.Scanner;

public class ejercicioPractico26 {
    public static void main(String[] args) {
        
        int passCajaFuerte = 4578;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce la clave para abrir la caja fuerte");
        int codigo = sc.nextInt();

        for(int intentos = 0; intentos < 5; intentos++){
            if(codigo == passCajaFuerte){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }else if(intentos == 0){
                System.out.println("Lo siento, esa no es la combinación. Te quedan 4 intentos");
                codigo = sc.nextInt();
            }else if(intentos == 1){
                System.out.println("Lo siento, esa no es la combinación. Te quedan 3 intentos");
                codigo = sc.nextInt();
            }else if(intentos == 2){
                System.out.println("Lo siento, esa no es la combinación. Te quedan 2 intentos");
                codigo = sc.nextInt();
            }else if(intentos == 3){
                System.out.println("Lo siento, esa no es la combinación. Te queda 1 intento");
                codigo = sc.nextInt();
            }else{
                System.out.println("Caja fuerte bloqueada");
            }
        }
        sc.close();

    }
}
