import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class metodoSete {
    public static void main(String[] args) {
        
        Set<String> set = new LinkedHashSet<String>();
        set.add("Uno");
        set.add("Dos");
        set.add("Tres");
        set.add("Uno");
        set.add("Cuatro");

        if(!set.add("Tres")){
            System.out.println("Error al insertar");
        }else{
            System.out.println("Insertado");
        }

        Iterator<String> j = set.iterator();
        while(j.hasNext()){
            System.out.println(j.next() + " ");
        }

    }
}
