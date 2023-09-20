package POO;

public class furgoneta extends Coche{
    private int capacidadCarga;
    private int plazasExtra;

    public furgoneta(int capacidadCarga, int plazasExtra){
        super(); //llama al constrcutor de la clase padre ''Coche'' para inicializar ''furgoneta'' con las características que ya teniamos creadas y asignadas en la clase Coche.
        this.capacidadCarga = capacidadCarga;
        this.plazasExtra = plazasExtra;
    }

    //Método Getter
    public String getDimeDatosFurgo(){
        return "La capacidad de carga es: " + capacidadCarga + " y las plazas son: " + plazasExtra;
    }
}
