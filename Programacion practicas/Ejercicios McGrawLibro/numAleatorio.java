import java.util.Random; 

public class numAleatorio {
    public static void main(String[] args) {
        // Random aleatorio = new Random();

        // // int numeroAleatorio = aleatorio.nextInt();
        // // double numeroAleatorio2 = aleatorio.nextDouble();

        // // System.out.println(numeroAleatorio);
        // // System.out.println(numeroAleatorio2);

        // int aleatorioEntre1y10 = (int) aleatorio.nextDouble() * 10 + 1; 
        // System.out.println(aleatorioEntre1y10);

        Random numAleatorio1 = new Random(234);

        int numAleatorio = numAleatorio1.nextInt();
        System.out.println(numAleatorio);
    }
}
