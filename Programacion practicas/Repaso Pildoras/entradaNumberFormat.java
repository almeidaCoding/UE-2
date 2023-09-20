import javax.swing.*;
public class entradaNumberFormat {
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog("Introduce un número");
        double num1Transform = Double.parseDouble(numero1);
        System.out.print("La raíz de " + num1Transform + " es:");
        System.out.printf("%1.2f", Math.sqrt(num1Transform));
    }
}
