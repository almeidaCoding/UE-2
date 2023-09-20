public class conversionParse {
    static String cadenaConNumeros = "24";
    static byte numeroEnteroPequeño = Byte.parseByte(cadenaConNumeros);
    static short numeroEnteroCorto = Short.parseShort(cadenaConNumeros);
    static int numeroEntero = Integer.parseInt(cadenaConNumeros);
    static long numeroEnteroLargo = Long.parseLong(cadenaConNumeros);
    static float numeroCientifico = Float.parseFloat(cadenaConNumeros);
    static double numeroCientificoLargo = Double.parseDouble(cadenaConNumeros);
    public static void main(String[] args) {
        System.out.println(numeroEnteroPequeño);
        System.out.println(numeroEnteroCorto);
        System.out.println(numeroEntero);
        System.out.println(numeroEnteroLargo);
        System.out.println(numeroCientifico);
        System.out.println(numeroCientificoLargo);
    }
}
