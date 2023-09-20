import java.util.Scanner;

public class ejercicioPractico13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Escribe un número del 1 al 7 para saber el día de la semana: ");
        int numUser = sc.nextInt();

        switch(numUser){
            case 1: System.out.println("El número 1 corresponde al lunes");
            break;
            case 2: System.out.println("El número 2 corresponde al martes");
            break;
            case 3: System.out.println("El número 3 corresponde al miércoles");
            break;
            case 4: System.out.println("El número 4 corresponde al jueves");
            break;
            case 5: System.out.println("El número 5 corresponde al viernes");
            break;
            case 6: System.out.println("El número 6 corresponde al sábado");
            break;
            case 7: System.out.println("El número 7 corresponde al domingo");
        }
        if(numUser > 7){
            System.out.println("Número erróneo. Introduce un número del 1 al 7");
        }
        sc.close();
    }
}
