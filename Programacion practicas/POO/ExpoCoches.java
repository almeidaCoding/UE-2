package POO;

import java.util.Scanner;

public class ExpoCoches {
    public static void main(String[] args) {
        Zona entradasPrincipales = new Zona(1000);
        Zona entradasCompraVenta = new Zona(200);
        Zona entradasVip = new Zona(25);

        Scanner teclado = new Scanner (System.in);
        boolean salir = false;
        int opciones = 0;
        
        while(!salir){
            System.out.println("Escoge una opción");

            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            opciones = teclado.nextInt();

            switch(opciones){
                case 1:
                    System.out.println("El número de entradas disponibles para la zona Principal es: " + entradasPrincipales.getEntradasPorVender() + "\n");
                    System.out.println("El número de entradas disponibles para la zona Compra-Venta es: " + entradasCompraVenta.getEntradasPorVender() + "\n");
                    System.out.println("El número de entradas disponibles para la zona Vip es: " + entradasVip.getEntradasPorVender() + "\n");
                break;
                case 2:
                    int opcionesComprar = 0;
                    
                    System.out.println("Elige la zona que deseas");
                    System.out.println("1. Zona Principal");
                    System.out.println("2. Zona Compra-Venta");
                    System.out.println("3. Zona Vip");
                    opcionesComprar = teclado.nextInt();
                    switch(opcionesComprar){
                        case 1 :
                            int entradasP = 0;
                            System.out.println("¿Cuantas entradas quieres?");
                            entradasP = teclado.nextInt();
                            entradasPrincipales.vender(entradasP);
                        break;
                        case 2 :
                            int entradasCV = 0;
                            System.out.println("¿Cuantas entradas quieres?");
                            entradasCV = teclado.nextInt();
                            entradasCompraVenta.vender(entradasCV);
                        break;
                        case 3 :
                            int entradasV = 0;
                            System.out.println("¿Cuantas entradas quieres?");
                            entradasV = teclado.nextInt();
                            entradasVip.vender(entradasV);
                        break;
                    }
                break;
                case 3: 
                    System.out.println("Hasta luego :)");
                    salir = true;
                break;
            }
        }
        teclado.close();
    }
}
class Zona {
    private int entradasPorVender;
    public Zona(int n){
        entradasPorVender = n;
    }
    public int getEntradasPorVender() {
        return entradasPorVender;
    }
    public void vender(int n) {
        if (this.entradasPorVender == 0) {
            System.out.println("Lo siento, las entradas para esa zona están agotadas.");
        } else if (this.entradasPorVender < n) {
            System.out.println("Sólo me quedan " + this.entradasPorVender
        + " entradas para esa zona.");
        }

        if (this.entradasPorVender >= n) {
            entradasPorVender -= n;
            System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
        }
    }
}