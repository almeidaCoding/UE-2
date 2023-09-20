package POO;
import javax.swing.*;

public class usoVehiculos {
    public static void main(String[] args) {
        Coche fiat = new Coche();
        furgoneta miFurgo = new furgoneta(580, 7);
        

        //Paso de Parámetros de coche fiat
        fiat.estableceColor(JOptionPane.showInputDialog("Introduce color"));
        fiat.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        fiat.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene asientos de climatizador?"));

        JOptionPane.showMessageDialog(null, fiat.datosGenerales());
        JOptionPane.showMessageDialog(null, fiat.dimeColor());
        JOptionPane.showMessageDialog(null, fiat.dimeAsientos());
        JOptionPane.showMessageDialog(null, fiat.dimeClimatizador());
        JOptionPane.showMessageDialog(null, fiat.pesoCoche());
        JOptionPane.showMessageDialog(null, "El precio final del coche es " + fiat.precioCoche());


        //Paso de Parámetros de una furgoneta
        miFurgo.estableceColor(JOptionPane.showInputDialog("Introduce color"));
        miFurgo.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        miFurgo.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene asientos de climatizador?"));

        JOptionPane.showMessageDialog(null, miFurgo.datosGenerales() + " " + miFurgo.getDimeDatosFurgo());
        JOptionPane.showMessageDialog(null, miFurgo.dimeColor());
        JOptionPane.showMessageDialog(null, miFurgo.dimeAsientos());
        JOptionPane.showMessageDialog(null, miFurgo.dimeClimatizador());
    }
}