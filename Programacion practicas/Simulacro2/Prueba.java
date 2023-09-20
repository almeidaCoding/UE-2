import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList <Figura2D> listaFiguras = new ArrayList<>();

        listaFiguras.add(new Circulo("Circulo1", 50));
        listaFiguras.add(new Circulo("Circulo2", 20));
        listaFiguras.add(new Rectangulo("Rectangulo1", 20, 30));
        listaFiguras.add(new Rectangulo("Rectangulo2", 30, 20));
        listaFiguras.add(new Triangulo("Triangulo1", 10, 10, 20));
        listaFiguras.add(new Triangulo("Triangulo2", 20, 20, 10));

        for(Figura2D e: listaFiguras){
            System.out.println("Nombre de la figura: " + e.getNombre() + "\n" + "Perímetro: " + e.calculaPerimetro() + "\n");
        }

        for(Figura2D e: listaFiguras){
            System.out.println(e.toString());
        }

    }
}