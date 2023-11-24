
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Unidad1Ejercicio3 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\chpal\\OneDrive\\Escritorio\\Código\\UE-2\\AccesoDatos\\prueba.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Probando el buffered de la clase FileWriter");
        bufferedWriter.newLine();
        bufferedWriter.write("Probando en una nueva linea");
        bufferedWriter.close();

        FileReader fileReader = new FileReader("C:\\Users\\chpal\\OneDrive\\Escritorio\\Código\\UE-2\\AccesoDatos\\prueba.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linea;
        while((linea = bufferedReader.readLine()) != null){
            System.out.println(linea);
        }
        bufferedReader.close();
    }
}