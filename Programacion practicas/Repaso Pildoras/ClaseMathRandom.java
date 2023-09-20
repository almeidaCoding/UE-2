// Imagina que quieres generar un número aleatorio en el rango [5, 20). Esto significa que quieres números aleatorios que sean iguales o mayores que 5, pero estrictamente menores que 20. Entonces, el rango total de números posibles es 20 - 5 = 15 (desde 5 hasta 19).
// Cuando generas un número aleatorio usando Math.random(), obtienes un número entre 0 (inclusive) y 1 (exclusivo). Si multiplicamos este número por el tamaño del rango (15 en este caso), obtendremos un valor entre 0 y 15. Luego, al agregar el valor mínimo (5), aseguramos que el número esté dentro del rango deseado [5, 20).

// Entonces, para resumir:
// Rango deseado: [5, 20)
// Tamaño del rango: 20 - 5 = 15
// Valor aleatorio generado por Math.random(): por ejemplo, 0.75 (esto varía cada vez que se ejecuta)
// Valor escalado dentro del rango: 0.75 * 15 = 11.25
// Valor final dentro del rango: 11.25 + 5 = 16.25
// En este ejemplo, 16.25 estaría dentro del rango [5, 20). Espero que esto haya aclarado cómo funciona el cálculo del rango y el valor aleatorio generado.


public class ClaseMathRandom {
    public static void main(String[] args) {
        int min = 5;
        int max = 20;
        int range = max - min;

        double randomValue = Math.random();
        int randomInRange = min + (int) (randomValue * range);
        System.out.println("Número aleatorio en el rango [" + min + ", " + max + "): " + randomInRange);
    }
}
