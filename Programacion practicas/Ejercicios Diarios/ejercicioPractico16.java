import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class ejercicioPractico16 {
    public static void main(String[] args) {
        
        ArrayList<String> palabras = new ArrayList<String>();
        Scanner teclado = new Scanner (System.in);

        while(palabras.size() < 10){
            System.out.println("Introduce una palabra: ");
            String userPalabras = teclado.nextLine();
            palabras.add(userPalabras + "\n");
        }
        for(int i = 0; i < palabras.size(); i++){
            System.out.println(palabras.get(i));
            Collections.sort(palabras);
        }
        teclado.close();
    }
}
