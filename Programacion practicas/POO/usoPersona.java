package POO;
import java.util.Date;
import java.util.GregorianCalendar;

public class usoPersona {
    public static void main(String[] args) {
        
        Persona [] lasPersonas = new Persona[2];
        lasPersonas[0] = new Empleado2("Beatriz Guillermo: ", 50000, 2020, 3, 15);
        lasPersonas[1] = new Alumno("Rosanna: ", "Ingienería Informática");

        for(Persona p: lasPersonas){ // for each
            System.out.println(p.dameNombre() + "" + p.dameDescripcion());
        }
        // for(int i = 0; i < lasPersonas.length; i++){
        //     System.out.println(lasPersonas[i].dameNombre() + "" + lasPersonas[i].dameDescripcion());
        // }
    }
}

abstract class Persona{

    private String nombre;

    public Persona(String nom){
        nombre = nom;
    }

    //Método getter
    public String dameNombre(){
        return nombre;
    }

    //Método abstracto
    public abstract String dameDescripcion();
}

class Empleado2 extends Persona{

    private double sueldo;
    private Date altaContrato;
    
    //Primer constructor con parámetros
    public Empleado2(String nom, double sue, int agno, int mes, int dia){
        super(nom); //Constructor de la clase padre

        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();        
    }
    public String dameDescripcion(){
        return "este empleado tiene un sueldo de: " + sueldo;
    }

    //Método getter
    public double dimeSueldo(){
        return sueldo;
    }
    //Método getter
    public Date fechAlta(){
        return altaContrato;
    }

    //Método setter
    public void aumentaSueldo(double porcentaje){
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }
}
class Alumno extends Persona{

    private String carrera;

    public Alumno(String nom, String carrera){
        super(nom);
        this.carrera = carrera;
    }
    public String dameDescripcion(){
        return "este alumno está estudiando la carrera de " + carrera;
    }

}