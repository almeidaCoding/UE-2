import java.util.Scanner;

public class ejercicioPractico31 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numUser = sc.nextInt();
        

        for(int i = numUser; numUser < 100; numUser++){
            if(numUser < 0){
                System.out.println("solo se permiten números positivos");
                break;
            }
            System.out.println(numUser);
            sc.close();
        }
    }
}
