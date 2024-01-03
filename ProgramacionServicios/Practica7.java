public class Practica7 {
    public static void main(String[] args) {
        int n = 50;
        long[] fibonacciSeries = new long[n];

        // Inicializar los dos primeros números de la serie
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;

        // Generar el resto de la serie
        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        // Imprimir la serie de Fibonacci
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries[i] + " ");
        }
    }
}