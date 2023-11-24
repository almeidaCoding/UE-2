
import java.io.File;
import java.io.IOException;

public class Unidad1Ejercicio1 {
    public static void main(String[] args) throws IOException {
        
        String directorioNuevo = "Prueba";
        File nuevoDirectorio = new File (directorioNuevo);
        boolean creadoCheck = nuevoDirectorio.mkdir();
        boolean yaExiste = nuevoDirectorio.exists();

        if(creadoCheck){
            System.out.println("Directorio creado correctamente");
        }else if(yaExiste){
            System.out.println("El directorio ya existe");
        }else{
            System.out.println("Error al intentar crear el directorio");
        }

        boolean esFile = nuevoDirectorio.isFile();
        boolean esDirectory = nuevoDirectorio.isDirectory();

        if(esFile){
            System.out.println("Es un archivo");
        }else if (esDirectory){
            System.out.println("Es un directorio");
        }else{
            System.out.println("Archivo o Directorio no existente");
        }

        String rutaArchivo = "C:\\Users\\chpal\\OneDrive\\Escritorio\\Código\\UE-2\\Prueba\\prueba1.java";
        File nuevoArchivo = new File(rutaArchivo);
        boolean crearArchivo = nuevoArchivo.createNewFile();

        if (crearArchivo) {
            System.out.println("Archivo creado correctamente");
        } else {
            System.out.println("No se ha podido crear el archivo");
        }
    }
}