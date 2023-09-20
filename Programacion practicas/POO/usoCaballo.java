package POO;

public class usoCaballo {
    public static void main(String[] args) {
        caballo caballoCorre = new caballo("híiiiiiiiii", "Grande", "Blanco", 200);
        caballo caballoNoCorre = new caballo("híiiiiiiiii", "Pequeño", "Negro", 100);

        System.out.println(caballoCorre.getDevuelveDatosCaballo());
        caballoCorre.setCorreCaballo("si");

        System.out.println(caballoNoCorre.getDevuelveDatosCaballo());
        caballoCorre.setCorreCaballo("no");
    }
}

class caballo{
    private String sonido;
    // private String corre; 
    private String tamaño;
    private String color;
    private int peso;
    private int numCaballo;
    private static int numCaballoAsignado = 1;

    public caballo(String sonido, String tamaño, String color, int peso){
        this.sonido = sonido;
        // corre = corre;
        this.tamaño = tamaño;
        this.color = color;
        this.peso = peso;
        numCaballo = numCaballoAsignado;
        numCaballoAsignado++;
    }

    public String getDevuelveDatosCaballo(){
        return "El caballo numero " + numCaballo + "\n" + "Pesa: " + peso + "\n" + "Su tamaño es: " + tamaño + "\n" + "Y su color es: " + color;
    }
    public String getSonidoCaballado(){
        return "El sonido que hace el caballo es: " + sonido;
    }
    public void setCorreCaballo(String corre){
        if(corre.equalsIgnoreCase("si")){
            System.out.println("Este caballo es especial para carreras de caballos\n");
        }else{
            System.out.println("Este caballo no puede participar en carreras de caballos\n");
        }
    }
}