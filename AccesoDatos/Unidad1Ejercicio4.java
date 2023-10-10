package AccesoDatos;

import java.io.*;

public class Unidad1Ejercicio4 {
    public static void main(String[] args) {
        // Crear un objeto a serializar
        Persona persona = new Persona("Juan", 30);
        
        try {
            // Crear un flujo de salida para escribir en un archivo
            FileOutputStream archivoSalida = new FileOutputStream("persona.ser");
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            
            // Serializar el objeto y escribirlo en el archivo
            objetoSalida.writeObject(persona);
            
            // Cerrar los flujos
            objetoSalida.close();
            archivoSalida.close();
            
            System.out.println("Objeto serializado y guardado en 'persona.ser'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Clase Persona que implementa Serializable
class Persona implements Serializable {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
