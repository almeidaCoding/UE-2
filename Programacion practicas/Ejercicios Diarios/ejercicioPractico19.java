import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ejercicioPractico19 {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("C:\\Users\\chpal\\OneDrive\\Escritorio\\Programacion\\Universidad Europea\\Programacion practicas\\Ejercicios Diarios\\palabras.txt");
            BufferedReader br = new BufferedReader (fr);

            ArrayList <String> palabras = new ArrayList<>();

            String linea; 

            while((linea = br.readLine()) != null){
                palabras.add(linea);
            }

            Collections.sort(palabras);
            
            for (int i = 0; i < palabras.size(); i++) {
                System.out.println(palabras.get(i));
            }

            br.close();

        }catch(FileNotFoundException e){
            System.out.println("Error al leer el archivo.");
        }catch (IOException e){
            System.out.println("Error al leer el archivo.");
        }
    }
}
