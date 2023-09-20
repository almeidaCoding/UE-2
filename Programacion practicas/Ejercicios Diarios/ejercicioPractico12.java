import java.util.Scanner;

public class ejercicioPractico12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String enterDay = "";
        String outProgram = "";

        while(enterDay.equals(outProgram)){
            System.out.println("Introduce un día de la semana: ");
            enterDay = sc.nextLine();
        }

        switch(enterDay){
            case "lunes": System.out.println("La primera asignatura del día lunes es Programación");
            break;

            case "martes": System.out.println("La primera asignatura del día martes es Base de datos");
            break;

            case "miercoles": System.out.println("La primera asignatura del día miércoles es Sistemas informáticos");
            break;

            case "jueves": System.out.println("La primera asignatura del día jueves es Lenguajes de marca");
            break;

            case "viernes": System.out.println("La primera asignatura del día jueves es Entornos de desarrollo");
            break;

            case "salir": System.out.println("Hasta luego :)");
            break;
        }

        sc.close();
    }
}
