import java.util.ArrayList;

public class ejercicioPractico4 {
    public static void main(String[] args) {
        ArrayList<String> compis = new ArrayList<String>();

        compis.add("Tami");
        compis.add("Majo");
        compis.add("Lolo");
        compis.add("Mariela");
        compis.add("Juan");
        compis.add("Ana");
        compis.add("Celia");
        compis.add("Rebeca");

        for(String nombres : compis){
            System.out.println(nombres);
        }

        for(int i = 0; i < compis.size(); i++){
            System.out.println(compis.get(i));
        }
    }
}
