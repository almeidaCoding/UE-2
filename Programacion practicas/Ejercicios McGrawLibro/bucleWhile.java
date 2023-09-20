import java.util.Scanner;

public class bucleWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Bienvenido al programa leer y escribir");
        System.out.println("Vamos a imprimir por pantalla todo lo que escribas");
        System.out.println("para terminar escribe FIN en mayúsculas");

        String cadenaDeTexto = teclado.nextLine();

        while(cadenaDeTexto != "Fin"){
            System.out.println(cadenaDeTexto);
            cadenaDeTexto = teclado.nextLine();
            System.out.println(cadenaDeTexto);
        }

        teclado.close();
    }
}
