import java.util.Scanner;

public class practicasFunciones {
    public static void main(String[] args) {
        // int [] arrayOriginal = {1, 10, 100};
        // cambiaValor(arrayOriginal);
        // System.out.println("Contenido del array después del cambio: ");
        //     for(int i = 0; i < arrayOriginal.length; i++) {
        //         System.out.printf("%2d ", arrayOriginal[i]);
        // };

        /////////////////////////////////////////////////////////////////////////////7

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un DNI: ");
        int dni = teclado.nextInt();
        char tuLetra = letraDNI(dni);
        System.out.println("La letra del DNI es la " + tuLetra);
        teclado.close();

    }

    // FUNCIONES

    //FUNCION, CAMBIAR CONTENIDO DEL ARRAY
    // public static void cambiaValor(int[] arrayOriginal) {
    //     for(int i = 0; i < arrayOriginal.length; i++) {
    //         arrayOriginal[i]++;
    //     } 
    // }
    // FUNCION LETRA DEL DNI SEGUN EL NUMERO DE DNI
    //Se pide que diseñes otra función a la cual le pasaremos un número de DNI y una letra, y nos devolverá el resultado true si la letra es correcta o false si no lo es.
    //Recuerda que desde una función puedes llamar a otra, es decir, que puedes utilizar la función que ya has creado en el punto anterior para averiguar cuál es la letra que le corresponde al DNI. Una vez la sepas, la puedes comparar con la que se ha pasado como segundo parámetro a la función que estás haciendo y, así, la función nos devolverá true si coindicen o false si no coinciden.
    public static char letraDNI(int numeroDNI) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B','N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int indiceBusqueda = numeroDNI % 23;
        return letras[indiceBusqueda];
    }
}