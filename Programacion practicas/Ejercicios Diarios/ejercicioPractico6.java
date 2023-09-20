public class ejercicioPractico6 {
    public static void main(String[] args) {
        // En Java, no es posible concatenar directamente variables de tipo char en una variable de tipo String utilizando el operador +. Esto se debe a que el operador + está sobrecargado en Java, lo que significa que su comportamiento depende del tipo de operandos que se estén utilizando. En este caso, como los operandos son de tipo char, el operador + se utiliza para realizar una suma aritmética y no una concatenación de cadenas.

        char letra1 = 'H';
        char letra2 = 'O';
        char letra3 = 'L';
        char letra4 = 'A';

        // String concatenar = letra1 + letra2 + letra3 + letra4; - > Esto NO se puede hacer en JAVA.

        // Concatenar char en una variable String se haría de la siguiente manera

        String pruebaConcat1 = new String(new char[]{letra1, letra2, letra3, letra4}); // utilizando el constructor de String y un array de char
        System.out.println(pruebaConcat1);

        String pruebaConcat2 = "" + letra1 + letra2 + letra3 + letra4; // utilizando el operador +
        System.out.println(pruebaConcat2);
        
    }
}
