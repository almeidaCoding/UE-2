import java.util.ArrayList;
import java.util.Collections;

public class metodoSortAList {
    public static void main(String[] args) {
        ArrayList<Integer> numerosEnteros = new ArrayList<Integer>();

        numerosEnteros.add(3);
        numerosEnteros.add(6);
        numerosEnteros.add(2);
        numerosEnteros.add(5);
        numerosEnteros.add(4);
        numerosEnteros.add(1);

        Collections.sort(numerosEnteros);
        System.out.println(numerosEnteros);

    }
}
