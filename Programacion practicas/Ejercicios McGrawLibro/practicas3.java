import java.util.Scanner;

public class practicas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número: ");
        int numUser = sc.nextInt();
        System.out.println("Tu número tiene " + convertidor(numUser) + " cifras");
        sc.close();
    }

    public static int convertidor (int userNum){
        String convert = Integer.toString(userNum);
        int cadena = convert.length();
        return cadena;
    }
}