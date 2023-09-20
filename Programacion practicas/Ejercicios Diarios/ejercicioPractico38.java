import java.util.Scanner;

public class ejercicioPractico38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double primerNum, segundoNum;
        int opciones = 0;
        boolean salir = false;
        boolean flagOperaciones = false;

        System.out.println("Bienvenido a la calculadora\n");
        System.out.println("Introduce el primer número");
        primerNum = sc.nextDouble();
        System.out.println("Introduce el segundo número");
        segundoNum = sc.nextDouble();

        

        while(!salir){
            System.out.println("\nElige una opción del menú de la calculadora:\n");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opciones = sc.nextInt();
            sc.nextLine();

            switch(opciones){
                case 1:
                    double resultadoSuma = primerNum + segundoNum;
                    System.out.println("El resultado de la suma es: " + resultadoSuma);
                    flagOperaciones = true;
                    break;
                case 2:
                    double resultadoResta = primerNum - segundoNum;
                    System.out.println("El resultado de la resta es: " + resultadoResta);
                    flagOperaciones = true;
                    break;
                case 3:
                    double resultadoMultiplicacion = primerNum * segundoNum;
                    System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
                    flagOperaciones = true;
                    break;
                case 4:
                    double resultadoDivision = primerNum / segundoNum;
                    System.out.println("El resultado de la división es: " + resultadoDivision);
                    flagOperaciones = true;
                    break;
                case 5:
                    if(flagOperaciones){
                        System.out.println("Hasta luego :)");
                        salir = true;
                    }else{
                        System.out.println("No has seleccionado ninguna opción");
                        salir = false;
                    }
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
        sc.close();
    }
}
