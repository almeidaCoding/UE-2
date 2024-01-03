import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numberOne, numberTwo;

        System.out.println("Introduce el primer un número: ");
        numberOne = sc.nextDouble();

        System.out.println("Introduce el segundo número: ");
        numberTwo = sc.nextDouble();

        sumar(numberOne, numberTwo);
        restar(numberOne, numberTwo);
        multiplicar(numberOne, numberTwo);
        dividir(numberOne, numberTwo);
        modulo(numberOne, numberTwo);

        sc.close();
    }

    //Suma

    public static double sumar (double a, double b){
        double suma = a + b;
        System.out.println("El resultado de la suma es: " + suma);
        return suma;
    }

    //Resta
    public static double restar (double a, double b){
        double resta = a - b;
        System.out.println("El resultado de la resta es: " + resta);
        return resta;
    }

    //Multiplicación
    public static double multiplicar (double a, double b){
        double multi = a * b;
        System.out.println("El resultado de la multiplicación es: " + multi);
        return multi;
    }
    //División
    public static double dividir (double a, double b){
        double divi = a / b;
        System.out.println("El resultado de la división es: " + divi);
        return divi;
    }

    public static double modulo(double a, double b){
        double modu = a % b;
        System.out.println("El resultado del módulo es: " + modu);
        return modu;
    }
}
