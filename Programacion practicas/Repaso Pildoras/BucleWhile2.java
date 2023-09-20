import javax.swing.*;

public class BucleWhile2 {
    public static void main(String[] args) {
        String clave = "Chantal";
        String pass = "";

        while(clave.equals(pass) == false){
            pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
            if(clave.equals(pass) == false){
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta, acceso permitido");
    }
}
