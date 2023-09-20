package POO;

import java.text.DecimalFormat;

public class Terminales {
    public static void main(String[] args) {

        System.out.println("Terminales" + "\n");
        Terminal t1 = new Terminal("678 11 22 33");
        Terminal t2 = new Terminal("644 74 44 69");
        Terminal t3 = new Terminal("622 32 89 09");
        Terminal t4 = new Terminal("664 73 98 18");
        System.out.println(t1);
        System.out.println(t2);
        t1.llama(t2, 320);
        t1.llama(t3, 200);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

        System.out.println("\nMoviles" + "\n");
        Movil m1 = new Movil("678 11 22 33", "rata");
        Movil m2 = new Movil("644 74 44 69", "mono");
        Movil m3 = new Movil("622 32 89 09", "bisonte");
        System.out.println(m1);
        System.out.println(m2);
        m1.llama(m2, 320);
        m1.llama(m3, 200);
        m2.llama(m3, 550);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}
class Terminal{
    private String numeroTerminal;
    protected int duracionLlamada;

    public Terminal(String numeroTerminal){
        this.numeroTerminal = numeroTerminal;
        this.duracionLlamada = 0;
    }
    public int llama(Terminal terminalDestino, int duracion){
        this.duracionLlamada += duracion;
        terminalDestino.duracionLlamada += duracion;
        return duracion;
    }
    public String getNumeroTerminal() {
        return numeroTerminal;
    }
    @Override
    public String toString() {
        return "Nº " + numeroTerminal + " - " + duracionLlamada + "s de conversación";
    }
}

class Movil extends Terminal{
    private String tarifas;
    private double costeTotal;

    public Movil(String numeroTerminal, String tarifas){
        super(numeroTerminal);
        this.tarifas = tarifas;
        this.costeTotal = 0.0;
    }

    @Override
    public int llama(Terminal terminalDestino, int duracion){
        
        double costePorMinuto;
        if (this.tarifas.equals("rata")) {
            costePorMinuto = 0.06;
        } else if (this.tarifas.equals("mono")) {
            costePorMinuto = 0.12;
        } else if (this.tarifas.equals("bisonte")) {
            costePorMinuto = 0.30;
        } else {
            costePorMinuto = 0.0;
        }
        double costeTotal = costePorMinuto * duracion / 60.0;
        this.costeTotal += costeTotal;
        
        return (int) costeTotal;
    }

    public double getCosteTotal() {
        return this.costeTotal;
    }

    @Override
    public String toString() {
        DecimalFormat formato = new DecimalFormat("#0.00");
        return "Nº " + this.getNumeroTerminal() + " - " + this.duracionLlamada +
        "s de conversación - tarificados " + formato.format(this.costeTotal) + " euros";
    }
}