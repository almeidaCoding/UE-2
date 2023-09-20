import java.util.Scanner;

public class practicasUserPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String passValid = "1234";
        String loginUser, passUser;
        System.out.print("Nombre de usuario: ");
        loginUser = sc.next();
        System.out.println("Introduce tu password: ");
        passUser = sc.next();

        for(int intentos = 0; intentos <= 3; intentos++){
            if(passValid.equals(passUser)){
                System.out.println("Bienvenida " + loginUser + " has iniciado sesión correctamente");
                break;
            }else if(intentos == 0){
                System.out.println("introduce tu password nuevamente");
                passUser = sc.next();
            }else if(intentos == 1){
                System.out.println("introduce tu password nuevamente, te quedan 2 intentos");
                passUser = sc.next();
            }else if(intentos == 2){
                System.out.println("introduce tu password nuevamente, ultimo intento");
                passUser = sc.next();
            }else if(intentos == 3){
                System.out.println("Acceso bloqueado. Intentelo de nuevo más tarde");
            }
        }
        sc.close();

        /* A partir del caso práctico anterior, modifica el programa para que
        si la contraseña no es correcta, la vuelva a pedir, pero dando como máximo 3 oportunidades para introducirla correctamente. */
    }
}