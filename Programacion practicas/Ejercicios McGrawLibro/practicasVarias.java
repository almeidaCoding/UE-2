import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random; 
import java.util.Scanner;

public class practicasVarias {
    public static void main(String[] args) {

        
        /* Conversión de cadena a numero entero con 'Interger' y 'ParseInt' */
        String cadena = "12345";

        int numeroEntero = Integer.parseInt(cadena);

        System.out.println(numeroEntero);

        /* Importar la clase 'Random' arroja números Random enteros y decimales */
        Random aleatorio = new Random();

        int numeroAleatorio = aleatorio.nextInt();
        double numeroAleatorio2 = aleatorio.nextDouble();

        System.out.println(numeroAleatorio);
        System.out.println(numeroAleatorio2);
        
    //////////////////////////////////////////////////////////////////////////////////////

        /* redondea 5.2 y devuelve 5 */
        int numeroRedondeado = (int) Math.round(5.2);
        System.out.println(numeroRedondeado);

        /* redondea 5.9 y devuelve 6 */
        int numeroRedondeado2 = (int) Math.round(5.9);
        System.out.println(numeroRedondeado2);

        /* devuelve 14, el valor mayor de los dos */
        int mayor = Math.max(10, 14);
        System.out.println(mayor);

        /* devuelve 4, el valor menor de los dos */
        int menor = Math.min(20, 4);
        System.out.println(menor);

        /* devuelve 6.0, la raíz cuadrada de 36 */
        double raiz = Math.sqrt(36);
        System.out.println(raiz);

        /* devuelve 32, el resultado de 2 elevado a 5 */
        double potencia = Math.pow(2, 5);
        System.out.println(potencia);

    //////////////////////////////////////////////////////////////////////////////////////

        /* La clase Date permite trabajar con fechas. */
        Date hoy = new Date();
        System.out.println("Hoy es: " + hoy);

        /* Para escoger el formato en el que mostramos la fecha disponemos de la clase SimpleDateFormat: */
        SimpleDateFormat formatea = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
        System.out.println("Hoy es " + formatea.format(hoy));
        
    //////////////////////////////////////////////////////////////////////////////////////

        /* Crea una sencilla aplicación que le pida al usuario un número y muestre por pantalla su 
        raíz cuadrada y su cuadrado. */
        Scanner teclado = new Scanner (System.in);

        System.out.println("Introduce un número por favor: ");
        int numero = teclado.nextInt();
        double raiz1 = (int) Math.sqrt(numero);
        double cuadrado = Math.pow(numero, 2);

        System.out.println("La raíz cuadrada de tú numero es: " + raiz1 + " y su cuadrado es : " + cuadrado);

        teclado.close();

    ////////////////////////////////////////////////////////////////////////////////////// 
        
        /* Array declarado */
        int [] arrayEnteros = {1, 2, 3, 4, 5};
        /* El arrayEnteros[4] en el System.out indica el número que se encuentra en la posiciín '4'
        del array o sea el '5' */
        System.out.println("El elemento de la posición 4 es " + arrayEnteros[4]);
        /* arrayEnteros esta solicitando que en la posición '2' del array se cambie el número de esa
        posición por el número '24' */
        arrayEnteros[2] = 24;
        System.out.println("Contenido de la posición 2: " + arrayEnteros[2]);

    //////////////////////////////////////////////////////////////////////////////////////

        Scanner sc = new Scanner(System.in);
        int[] arrayEnteros2 = new int[4]; // declaración del array
        
        
        /* bucle for con variable int llamada 'indice' la cual inicia en 0, luego se compara
        con el 'arrayEnteros2' ya que el length mide la longitud y finalmente se incrementa */
        for(int indice = 0; indice < arrayEnteros2.length; indice++) {
            System.out.print("Introduzca el valor para la posición " + indice + ": ");
            // el usuario introduce los números en las posiciones del array 'arrayEnteros2[indice]'
            arrayEnteros2[indice] = sc.nextInt();
        }

        System.out.println("----El contenido de tu array es el siguiente----");
        
        /* Finalmente se mete dentro del bucle for el System.out.println para que nuevamente
        el indice se inicie en 0, se compare e incremente pero ahora para mostrar el resultado 
        de cada una de las posiciones del array */
        for(int indice = 0; indice < arrayEnteros2.length; indice++) {
            System.out.println("El valor de la posición " + indice + " es: " + arrayEnteros2[indice]);System.out.println("El valor de la posición " + indice + " es: " + arrayEnteros2[indice]);
        }
        sc.close();
        //////////////////////////////////////////////////////////////////////////////////////

        Scanner ejercicio = new Scanner (System.in);
       
        System.out.println("Introduce un número: ");
        double numeroUsuario = sc.nextDouble();
        double resto = (numeroUsuario % 5);
       
        if((resto == 0) || (resto == 1) || (resto == 2) || (resto == 3) || (resto == 4)){
            System.out.println("El modulo de tú numero es: " + resto);
        }else{
            System.out.println("el módulo de tu número es diferente a: 0, 1, 2, 3 y 4");
        }
        ejercicio.close();
        
        //////////////////////////////////////////////////////////////////////////////////////

        String[] arrayString = new String[10];
        Scanner arrays = new Scanner(System.in);
        for(int indice = 0; indice < arrayString.length ; indice++) {
            System.out.print("Introduce la palabra número " + (indice+1) + ": ");
            arrayString[indice] = teclado.next();
        }

        System.out.println("=== PALABRAS INTRODUCIDAS ===");

        for(int indice = 0; indice < arrayString.length; indice++) {
            System.out.println("Palabra número " + (indice+1) + ": " + 
            arrayString[indice]);
        }
        arrays.close(); 
    }
}