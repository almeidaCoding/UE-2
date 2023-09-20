import javax.swing.JOptionPane;

public class ClaseString {
    public static void main(String[] args) {

        String nombre = "Chantal";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Tiene " + nombre.length() + " letras");
        System.out.println("La primera letra de mi nombre es la " + nombre.charAt(0));

        int ultimaLetra = nombre.length();
        System.out.println("Y la última letra es la " + nombre.charAt(ultimaLetra-1));

        String frase = "Hoy es un estupendo día para aprender a programar en Java";
        String fraseResumen = frase.substring(29, 57);
        System.out.println(fraseResumen);

        String alumno1, alumno2;
        alumno1 = "David";
        alumno2 = "David";
        System.out.println(alumno1.equals(alumno2));

        String alumno3, alumno4;
        alumno3 = "Pedro";
        alumno4 = "pedro";
        System.out.println(alumno3.equalsIgnoreCase(alumno4));

        JOptionPane.showInputDialog("Hola");

    }
}
