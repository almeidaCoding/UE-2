import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ejercicioPractico15 {
    public static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        Scanner teclado = new Scanner(System.in);

        while (listaNumeros.size() < 10) {
            System.out.println("Introduce un número: ");
            int numerosIntroducidos = teclado.nextInt();
            listaNumeros.add(numerosIntroducidos);
        }

        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
            System.out.println("Los números ordenados son:");
            Collections.sort(listaNumeros);
        }
        teclado.close();
    }
}
