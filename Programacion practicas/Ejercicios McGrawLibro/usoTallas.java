import java.util.Scanner;

public class usoTallas {
    enum Talla{
        
        MINI("S"), MEDIANO("M"), GRANDE("L"), EXTRA_GRANDE("XL");

        private String abrev;

        private Talla(String abrev){ // Constructor
            this.abrev = abrev;
        }

        public String setDameAbreviatura(){
            return abrev;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce una talla: MINI, MEDIANO, GRANDE, EXTRA_GRANDE ");
        String entradaDatos = sc.nextLine().toUpperCase();

        Talla tallaUser = Enum.valueOf(Talla.class, entradaDatos);

        System.out.println("Talla = " + tallaUser);
        System.out.println("Abreviatura = " + tallaUser.setDameAbreviatura());

        sc.close();
    }
}