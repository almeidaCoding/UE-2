public class ejercicioPractico5 {
    public static void main(String[] args) {
        double play5 = 560.99;
        double iphone = 1500.99;
        double airpods = 350;
        double juego = 65.40;

        int porcentajeIva = 21;
        double factura = play5 + iphone + airpods + juego;
        double iva = factura * porcentajeIva / 100;
        double resultado = factura + iva;
    
        System.out.println("Tu precio imponible es: " + factura);
        System.out.println("El procentaje del iva es: " + porcentajeIva);
        System.out.println("El iva es: " + iva);
        System.out.println("El total de tu factura es: " + resultado);
    }
}