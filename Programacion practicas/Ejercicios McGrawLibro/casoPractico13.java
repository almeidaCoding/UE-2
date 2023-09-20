import java.util.Scanner;

public class casoPractico13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número del 1 al 7 para saber que día de la semana es: ");
        int diaSemana = sc.nextInt();

        if(diaSemana == 1){
            System.out.println("Hoy es lunes");
        }else if(diaSemana == 2){
            System.out.println("Hoy es martes");
        }else if(diaSemana == 3){
            System.out.println("Hoy es miércoles");
        }else if(diaSemana == 4){
            System.out.println("Hoy es jueves");
        }else if(diaSemana == 5){
            System.out.println("Hoy es viernes");
        }else if(diaSemana == 6){
            System.out.println("Hoy es sabado");
        }else if(diaSemana == 7){
            System.out.println("Hoy es domingo");
        }else{
            System.out.println("Introduce un número del 1 al 7 por favor.");
        }

        sc.close();
    }
}
