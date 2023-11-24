
import java.io.File;

public class Unidad1Ejercicio2 {
    public static void main(String[] args) {
        try {
            String ruta = args[0];
            File f = new File(ruta);
    
            if (f.exists()) {
                if (f.isFile()) {
                    System.out.println("El tamaño es de: " + f.length());
                    System.out.println("Puede ejecutarse: " + f.canExecute());
                    System.out.println("Puede leerse: " + f.canRead());
                    System.out.println("Puede escribirse: " + f.canWrite());
                } else {
                    String[] losArchivos = f.list();
                    System.out.println("El directorio " + ruta + " contiene:");
                    for (String archivo : losArchivos) {
                        System.out.println("\t" + archivo);
                    }
                }
            } else {
                System.out.println("El archivo o directorio no existe.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Debes proporcionar una ruta como argumento.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}