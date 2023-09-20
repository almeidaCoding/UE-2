import java.util.Scanner;

public class practicasVarias2 {
    public static void main(String[] args) {
        //OBJETOS EJERCICIO DE LA U6
        String cadena1 = new String("Hola, mundo"); // creamos el objeto cadena1
        String cadena2 = cadena1; // creamos el objeto cadena2 copia de cadena1
        cadena2 = "Hello, world"; // cambiamos el valor de cadena2
        System.out.println("Cadena 1: " + cadena1 + " Cadena2: " + cadena2);

        ////////////////////////////////////////////////////////////////////

        
        /*System.out.println("Introduce un número y pulsa 0 para salir");
        String numeroIntroducido = teclado.nextLine();
        String cadenaNumeros = "";

        while(Integer.parseInt(numeroIntroducido) != 0){ // otra opción: numeroIntroducido.equals("0")
            cadenaNumeros = cadenaNumeros + numeroIntroducido + " ";
            numeroIntroducido = teclado.nextLine();
        }
        System.out.println("Los números introducidos son: " + cadenaNumeros);
        teclado.close();*/

        //////////////////////////////////////////////////////////////////////

        /*Scanner sc = new Scanner (System.in);
        int [] numerosIntroducidos2 = new int [50];
        System.out.println("Introduce un número y pulsa 0 para salir");
        int almacenadorNumero = sc.nextInt();
        int contador = 0;

        while(almacenadorNumero != 0){
            numerosIntroducidos2 [contador] = almacenadorNumero;
            contador ++;
            almacenadorNumero = sc.nextInt();
        }
        System.out.println("Los números introducidos son: ");
        for (int i = 0; i < contador; i++){
            System.out.println(numerosIntroducidos2[i]);
        }
        sc.close();*/

        //////////////////////////////////////////////////////////////////////

        Scanner tecli = new Scanner (System.in);
        
        System.out.println("Introduce las filas de la primera matriz");
        int filas1 = tecli.nextInt(0);
        System.out.println("Introduce las columnas de la primera matriz");
        int columnas1 = tecli.nextInt(0);
        System.out.println("Introduce las filas de la segunda matriz");
        int filas2 = tecli.nextInt(0);
        System.out.println("Introduce las columnas de la segunda matriz");
        int columnas2 = tecli.nextInt(0);

        int [][] matriz1 = new int [filas1][columnas1];
        int [][] matriz2 = new int [filas2][columnas2];
        
        System.out.println("Rellenamos la primera matriz");
        for (int i = 0; i<filas1; i++){
            for(int j = 0; j<columnas1; i++){
                System.out.println("Introduce el valor de la posición [" + i + "][" + j + "]");
                matriz1[i][j] = tecli.nextInt();
            }
        }

        System.out.println("Rellenamos la segunda matriz");
        for (int i = 0; i<filas2; i++){
            for(int j = 0; j<columnas2; i++){
                System.out.println("Introduce el valor de la posición [" + i + "][" + j + "]");
                matriz1[i][j] = tecli.nextInt();
            }
        }

        for (int i = 0; i<filas1; i++){
            for(int j = 0; j<columnas1; i++){
                for(int n = 0; n<filas2; n++){
                    for(int k = 0; k<columnas2; k++ ){
                        if(matriz1[i][j] == matriz2 [n][k]){
                            System.out.println(matriz1[i][j]);
                        }
                    }
                }
            }
        }
        tecli.close();

    }
}
