import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practica5 {
    public static void main(String[] args) {
        
        String fileContent = readText();
        System.out.println("Texto en el fichero: \n" + fileContent);

        int numberOfLetters = numberLetters(fileContent);
        System.out.println("Número de letras: " + numberOfLetters);

        int numberOfSequence = numberSequence(fileContent);
        System.out.println("Número de oraciones: " + numberOfSequence);

    }

    private static String readText(){
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\chpal\\OneDrive\\Escritorio\\Código\\UE2\\ProgramacionServicios\\LecturaFichero.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    private static int numberLetters(String text){
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            char letter = text.charAt(i);
            if(Character.isLetter(letter)){
                count++;
            }
        }
        return count;
    }

    private static int numberSequence(String text){
        String[] sequenceStrings = text.split("[.!?]");
        return sequenceStrings.length;
    }
}
