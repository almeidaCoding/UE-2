import java.io.FileWriter;
import java.io.IOException;

public class ejercicioPractico17 {
    public static void main(String[] args){
        int numInicio = 1;
        int numFin = 500;
        String numerosPrimos = "";
        
        try{
            System.out.println("Números primos entre " + numInicio + " y " + numFin + ": ");
            for (int i = numInicio; i <= numFin; i++) {
                boolean esPrimo = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    numerosPrimos += i + " \n";
                }
        }
            FileWriter writer = new FileWriter("C:\\Users\\chpal\\OneDrive\\Escritorio\\Programacion\\Universidad Europea\\Programacion practicas\\Ejercicios Diarios\\numeros.txt");
            writer.write(numerosPrimos);
            writer.close();
        }catch(IOException e){
            System.err.println("Se ha producido un error al crear el archivo: " + e.getMessage());
        }
    }
}