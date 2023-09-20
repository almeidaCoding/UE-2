package POO;

public class empleadosOne {
    public static void main(String[] args) {
        personasEmpleo trabajador1 = new personasEmpleo("Susana");
        personasEmpleo trabajador2 = new personasEmpleo("Beatriz");
        personasEmpleo trabajador3 = new personasEmpleo("Mirella");
        personasEmpleo trabajador4 = new personasEmpleo("Rosanna");
        personasEmpleo trabajador5 = new personasEmpleo("Renato");
        personasEmpleo trabajador6 = new personasEmpleo("Karina");

        System.out.println(trabajador1.devuelveDatos() + "\n" + "\n" + trabajador2.devuelveDatos() + "\n" + "\n" + trabajador3.devuelveDatos() + "\n" + "\n" + trabajador4.devuelveDatos() + "\n" + "\n" + trabajador5.devuelveDatos() + "\n" + "\n" + trabajador6.devuelveDatos());

        System.out.println(personasEmpleo.dameIdSiguiente());

    }
}

class personasEmpleo{

    private String nombre;
    private String seccion;
    private int id;
    private static int idAsignados = 1;

    public personasEmpleo(String nom){
        nombre = nom;
        seccion = "Administración";
        id = idAsignados;
        idAsignados++;
    }
    
    //Método getter
    public String devuelveDatos(){
        return "Nombre del empleado: \n" + nombre + "\nSector donde trabaja: \n" + seccion + "\nID de empleado: \n" + id;
    }

    //Método Static
    public static String dameIdSiguiente(){
        return "El siguiente ID es: " + idAsignados;
    }
}
