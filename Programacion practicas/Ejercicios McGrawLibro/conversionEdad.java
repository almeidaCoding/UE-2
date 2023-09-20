public class conversionEdad {
    static final byte MAYORIA_EDAD_LEGAL = 20;
    static String edadActual = "18";
    static byte edadActualNumerica = Byte.parseByte(edadActual);
    public static void main(String[] args) {
        System.out.println("Tengo " +  (edadActualNumerica - MAYORIA_EDAD_LEGAL) + "años más que la edad legal");
    }
}
