public class Practica8 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Ana lleva al oso la avellana"));
    }

    public static boolean isPalindrome(String text) {
        // Paso 1: Eliminar caracteres no deseados
        String cleanedText = text.replaceAll("[^a-zA-Z]", "");

        // Paso 2: Convertir a minúsculas
        String lowercaseText = cleanedText.toLowerCase();

        // Paso 3: Comparar caracteres
        int left = 0;
        int right = lowercaseText.length() - 1;

        while (left < right) {
            if (lowercaseText.charAt(left) != lowercaseText.charAt(right)) {
                return false; // No es un palíndromo
            }
            left++;
            right--;
        }

        // Paso 4: Es un palíndromo
        return true;
    }

}
