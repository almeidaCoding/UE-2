import javax.swing.*;

public class ProgramaPeso {
    public static void main(String[] args) {
        String genero = "";

        do{
            genero = JOptionPane.showInputDialog("Introduce tu género (F/M)");
        }while(genero.equalsIgnoreCase("F") == false && genero.equalsIgnoreCase("M") == false);

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
        int pesoIdeal = 0;

        if(genero.equalsIgnoreCase("M")){
            pesoIdeal = altura-110;
        }else if(genero.equalsIgnoreCase("F")){
            pesoIdeal = altura-120;
        }
        System.out.println("Tu peso ideal es: " + pesoIdeal + "kg");
    }
}
