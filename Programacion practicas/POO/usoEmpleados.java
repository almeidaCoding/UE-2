package POO;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
// import javax.swing.*;

public class usoEmpleados {
    public static void main(String[] args) {

        // Empleado empleado1 = new Empleado("Beatriz", 30000, 2020, 03, 20);
        // Empleado empleado2 = new Empleado("Rosanna", 30000, 2010, 07, 15);
        // Empleado empleado3 = new Empleado("Mirella", 40000, 2005, 10, 05);

        // empleado1.aumentaSueldo(10);
        // empleado2.aumentaSueldo(12);
        // empleado3.aumentaSueldo(5);

        // JOptionPane.showMessageDialog(null, "Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dimeSueldo() + " Fecha de alta: " + empleado1.fechAlta());
        // JOptionPane.showMessageDialog(null, "Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dimeSueldo() + " Fecha de alta: " + empleado2.fechAlta());
        // JOptionPane.showMessageDialog(null, "Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dimeSueldo() + " Fecha de alta: " + empleado3.fechAlta());
        
        Jefatura jefeAdministracion = new Jefatura("Luan", 55000, 2002, 5, 20);
        jefeAdministracion.setEstableceIncentivo(2570);


        Empleado [] misEmpleados = new Empleado[6];
        
        misEmpleados[0] = new Empleado("Beatriz Guillermo", 30000, 2020, 03, 20);
        misEmpleados[1] = new Empleado("Rosanna Palmucci", 30000, 2010, 07, 15);
        misEmpleados[2] = new Empleado("Mirella", 40000, 2005, 10, 05); // llama al constructor que tiene 5 parámetros.
        misEmpleados[3] = new Empleado("Luciano"); // llama al constrcutor que tiene 2 parámetros.
        misEmpleados[4] = jefeAdministracion; //Polimorfismo
        misEmpleados[5] = new Jefatura("Maria", 95000, 2000, 9, 20); //Polimorfismo

        Jefatura jefaFinanzas = (Jefatura) misEmpleados[5]; //conversion de objetos con casting
        jefaFinanzas.setEstableceIncentivo(55000);

        System.out.println(jefaFinanzas.tomarDecisiones("Dar más días de vacaciones a los empleados\n"));

        System.out.println("El jefe " + jefaFinanzas.dameNombre() +  " tiene un bonus de: " + jefaFinanzas.estableceBonus(500) + "\n");

        System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " + misEmpleados[3].estableceBonus(200) + "\n");

        // Empleado directorComercial = new Jefatura("Joana", 23000, 2019, 2, 2); //principio de sustitución 'directorComercial' es de tipo Jefatura que a su vez es un Empleado

        // Comparable ejemplo = new Empleado("Pedro", 18000, 2011, 4, 4); //instancia de interfaz de tipo empleado (principio de sustitución)

        // if(directorComercial instanceof Empleado){
        //     System.out.println("Es de tipo Jefatura");
        // }
        // if(ejemplo instanceof Comparable){
        //     System.out.println("Implementa la interfaz comparable\n");
        // }

        for(Empleado e: misEmpleados){
            e.aumentaSueldo(5);
        }

        Arrays.sort(misEmpleados);

        for(Empleado e: misEmpleados){
            System.out.println("Nombre: \n" + e.dameNombre() + "\nSueldo: \n" + e.dimeSueldo() + "\nFecha de alta: \n" + e.fechAlta() + "\n");
        }

    }
}

//class Empleado sin el modificador de acceso ''public'' -> no se debe colocar ya que vamos a crea todas las clases en un mismo fichero.
class Empleado implements trabajadores{

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    
    //Primer constructor con parámetros
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime();
    }

    //Segundo constrcutor con parámetros
    public Empleado(String nom){
        this(nom, 30000, 2000, 01, 02); // llamada al constructor de 5 parámetros.
    }

    //Método de la interfaz trabajadores implementado en la clase empleado
    public double estableceBonus(double gratificacion){
        return trabajadores.bonusBase+gratificacion;
    }

    //Método getter
    public String dameNombre(){
        return nombre;
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

    //Método CompareTo para ordenar Arrays con 'Sort' interfaz predefinida de la API de Java
    public int compareTo(Object miObjecto){
        Empleado otroEmpleado = (Empleado) miObjecto;
        if(this.sueldo<otroEmpleado.sueldo){
            return -1;
        }

        if(this.sueldo>otroEmpleado.sueldo){
            return 1;
        }
        
        return 0;
    }
}

//Clase que hereda de empleado
    class Jefatura extends Empleado implements jefes{

    private double incentivo;

    //Constructor con parámetros
    public Jefatura(String nom, double sue, int agno, int mes, int dia){
        super(nom, sue, agno, mes, dia); //llamando al padre y al constructor del padre
    }
    
    //Método de la Interfaz Jefe
    public String tomarDecisiones(String decision){
        return "Un miembro de la dirección ha tomado la decisión de: " + decision;
    }

    //Método de la interfaz trabajadores (la interfaz jefe está heredando el método trabajadores, por ende hay que declararlo en la clase jefatura ya que la clase jefatura tiene implementada la interfaz jefes)
    public double estableceBonus(double gratificacion){
        double prima = 2000;
        return trabajadores.bonusBase+gratificacion+prima;
    }

    //Método setter
    public void setEstableceIncentivo(double b){
        incentivo = b;
    }
    
    //Método getter
    //la anotación @override antes de la 
    // declaración del método en la subclase, para informar al compilador o a cualquier otra herramienta (o 
    // a quien sea que lea el código posteriormente) de que estamos ante una sobreescritura
    @Override
    public double dimeSueldo(){ // este método sobrescribe al de la clase padre.
        double sueldoJefe = super.dimeSueldo();
        return sueldoJefe + incentivo;
    }

    
}