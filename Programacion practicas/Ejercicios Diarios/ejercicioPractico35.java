import java.util.*;

public class ejercicioPractico35{
    public static void main(String[] args) {

        //Array unidimensional
        // Empleado listaEmpleados[] = new Empleado[3];
        // listaEmpleados [0] = new Empleado("Ana", 25, 2500);
        // listaEmpleados [1] = new Empleado("Antonio", 50, 2000);
        // listaEmpleados [2] = new Empleado("Maria", 30, 1600);

        // listaEmpleados.trimToSize(); - cierra el arraylist una vez añadimos todos nuestros objetos. Se utiliza por optimización de recursos.
        //listaEmpleados.ensureCapacity(11); - Indica la capacidad que tiene el arralist, pero no impide seguir añadiendo objetos. Se utiliza por optimización de recursos.

        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        listaEmpleados.add(new Empleado("Ana", 25, 2500));
        listaEmpleados.add(new Empleado("Antonio", 50, 2000));
        listaEmpleados.add(new Empleado("Maria", 30, 1600));
        

        System.out.println(listaEmpleados.size()); // indica cuantos elementos tiene el arraylist

        // Bucle foreach
        // for(Empleado e: listaEmpleados){
        //     System.out.println(e.dameDatos());
        // }
        
        //Bucle for convencional
        for(int i = 0; i < listaEmpleados.size(); i++){
            Empleado e = listaEmpleados.get(i);
            System.out.println(e.dameDatos());
        }

    }
}


class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String dameDatos(){
        return "El empleado se llama: " + nombre + ". Tiene " + edad + " años." + " Y un salario de " + salario;
    }
}
