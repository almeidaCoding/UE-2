import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Practica4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nameUser, surnameUser, phoneUser, ageUser, dni;
        String dataContinue = "";
        ArrayList<String> usuariosList = loadUsuarios();

        do {
            System.out.println("Introduce el nombre:");
            nameUser = sc.nextLine();

            System.out.println("Introduce el apellido:");
            surnameUser = sc.nextLine();

            System.out.println("Introduce el teléfono:");
            phoneUser = sc.nextLine();

            System.out.println("Introduce la edad:");
            ageUser = sc.nextLine();

            System.out.println("Introduce el DNI:");
            dni = sc.nextLine();

            System.out.println("Quieres introducir otro usuario?");
            dataContinue = sc.nextLine();

            String usuario = "Nombre: " + nameUser + "\n" + "Apellido: " + surnameUser + "\n" + "Teléfono: " + phoneUser + "\n" + "Edad: " + ageUser + "\n" + "DNI: " + dni;
            usuariosList.add(usuario);

        } while (dataContinue.equalsIgnoreCase("si"));

        saveUsuarios(usuariosList);
        viewUserList(usuariosList);
    }

    private static void viewUserList (ArrayList<String> usuariosList){
        System.out.println("\nUsuarios en la lista:\n");
            for(String usersList : usuariosList){
                System.out.println(usersList);
            }
    }

    private static ArrayList<String> loadUsuarios() {
        ArrayList<String> usuariosList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\chpal\\OneDrive\\Escritorio\\Código\\UE2\\ProgramacionServicios\\Usuarios.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                usuariosList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return usuariosList;
    }

    private static void saveUsuarios(ArrayList<String> usuariosList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\chpal\\OneDrive\\Escritorio\\Código\\UE2\\ProgramacionServicios\\usuarios.txt"))) {
            for (String user : usuariosList) {
                writer.write(user);
                writer.newLine();
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
