import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DinamicMap {
    public static void main(String[] args) {

        Map<String, Integer> palabrasQuijote = new HashMap<String, Integer>();

        //Insertar elementos
        palabrasQuijote.put("Quijote", 2174);
        palabrasQuijote.put("Sancho", 2147);
        palabrasQuijote.put("señor", 1063);
        palabrasQuijote.put("merced", 900);
        palabrasQuijote.put("caballero", 661);

        // Obtener el valor de una clave
        System.out.println("Veces que aparece 'señor': " + palabrasQuijote.get("señor"));

        // Imprimir (sin recorrer) el diccionario
        System.out.println("HasMap:" + palabrasQuijote);

        // Eliminar el valor de la clave "merced"
        palabrasQuijote.remove("merced");

        // Imprimir recorriendo con Iterator
        Set set = palabrasQuijote.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("Clave: " + mentry.getKey() +  " - Valor: " + mentry.getValue()); 
        }

    }
}
