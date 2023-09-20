import java.util.Scanner;

public class ejercicioPractico14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce la nota de las asigntaruas para obtener la media: ");
        System.out.println("Programación: ");
        double notaProgram = sc.nextDouble();
        System.out.println("Sistemas Informáticos: ");
        double notaSistemas = sc.nextDouble();
        System.out.println("Entornos de desarrollo: ");
        double notaEntornos = sc.nextDouble();
        System.out.println("Base de datos: ");
        double notaBaseDatos = sc.nextDouble();
        System.out.println("Lenguajes de marca: ");
        double notaLenguajes = sc.nextDouble();
        System.out.println("Formación y orientación laboral: ");
        double notaFol = sc.nextDouble();

        double notaMedia = (notaProgram + notaBaseDatos + notaEntornos + notaFol + notaSistemas + notaLenguajes)/6;

        System.out.println("La nota media de tus asignaturas es: " + notaMedia);

        sc.close();
    }
}
