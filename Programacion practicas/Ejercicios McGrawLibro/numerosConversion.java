public class numerosConversion {
    static double numeroLargo = 3.8;
    static int numeroEnteroX = (int) Math.round(numeroLargo);
    static int numeroEnteroY = (int) Math.ceil(numeroLargo);
    static int numeroEnteroZ = (int) Math.floor(numeroLargo);
    public static void main(String[] args) {
        
        System.out.println(numeroEnteroX);
        System.out.println(numeroEnteroY);
        System.out.println(numeroEnteroZ);
    }
}
