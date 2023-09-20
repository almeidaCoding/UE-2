import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<String> misAlumnos = new ArrayList<String>();
        misAlumnos.add("Tami");
        misAlumnos.add("Lili");
        misAlumnos.add("Mariela");
        misAlumnos.add("Beita");
        misAlumnos.add("Majo");

        //Elimna elementos
        if(misAlumnos.remove("Majo")){
            System.out.println("Elemento eliminado correctamente");
        }else{
            System.out.println("No existe el alumno");
        }
        //Recorriendo via for
        for(int i = 0; i < misAlumnos.size(); i++){
            System.out.println(misAlumnos.get(i));
        }
        //Comprobando si existe el elemento
        if (misAlumnos.contains("Ana"))
            System.out.println("SÍ existe el alumno en el ArrayList");
        else
            System.out.println("NO existe el alumno en el ArrayList");

        //Recorriendo via Iterator
        Iterator<String> miListaIterator = misAlumnos.iterator();
        while(miListaIterator.hasNext()){
            System.out.println(miListaIterator.next());
        }
    }
}
