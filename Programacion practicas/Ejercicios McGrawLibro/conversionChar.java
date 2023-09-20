public class conversionChar {
    static int numeroEntero = 'A';
    static char valorCaracter = 65; 
    public static void main(String[] args) {
        valorCaracter = (char) ((int) 'A' + 1);
        numeroEntero = (int) ((char) 65 + 1);
        System.out.println(valorCaracter);
        System.out.println(numeroEntero);
    }
}
