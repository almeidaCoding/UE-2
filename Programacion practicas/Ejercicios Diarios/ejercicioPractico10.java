import java.util.Scanner;

public class ejercicioPractico10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int horasEnEuros = 12;
        int diasTrabajadosPorSemana = 5;

        System.out.println("Indica cuanta horas trabajas diariamente: ");
        int horasTrabajadas = sc.nextInt();

        int resultado = horasTrabajadas * diasTrabajadosPorSemana * horasEnEuros;
        System.out.println("Tu salario semanal es: " + resultado);

        sc.close();
    }
}
