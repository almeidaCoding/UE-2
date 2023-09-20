import java.util.Scanner;

public class ejercicioPractico36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce una vocal: ");
        String cadena = sc.nextLine();
        
        if(!cadena.matches("[aeiouAEIOU]")){
            System.out.println("Error has introducido una consonante");
        }else{
            System.out.println("Correcto, has introducido una vocal");
        }
        sc.close();
    }
    
}
