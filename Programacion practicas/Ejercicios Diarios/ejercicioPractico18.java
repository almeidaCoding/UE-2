import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejercicioPractico18 {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("C:\\Users\\chpal\\OneDrive\\Escritorio\\Programacion\\Universidad Europea\\Programacion practicas\\Ejercicios Diarios\\numeros.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea;

            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }

            br.close();
            
        }catch(FileNotFoundException e){
            System.out.println("Error al leer el archivo.");
        }catch(IOException e){
            System.out.println("Error al leer el archivo.");
        }
    }
}
