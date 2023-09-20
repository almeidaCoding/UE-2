public class ejercicioPractico1 {
    public static void main(String[] args) {
        String nombre = "";
        String direccion = "";
        String telefono = "";

        System.out.println(devuelveDatos(nombre, direccion, telefono));
    }
    public static String devuelveDatos(String nom, String direcc, String telefono){
        nom = "Chantal";
        direcc = "Calle Márques de Santa Ana 26";
        telefono = "603290902";
        String guardarDatos = nom + "\n" + direcc + "\n" + telefono;
        return guardarDatos;
    }
}
