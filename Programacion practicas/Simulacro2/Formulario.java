import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String nombreUser = "";
        String apellidoUser = "";
        String dniUser = "";
        String emailUser = "";
        int opciones = 0;
        boolean salir = false;
        boolean flagName = false;
        boolean flagApellido = false;
        boolean flagEmail = false;
        boolean flagDNI = false;

        while(!salir){
            System.out.println("Introduce los datos del formulario\n");
            System.out.println("1. Rellenar nombre");
            System.out.println("2. Rellenar apellido");
            System.out.println("3. Rellenar DNI");
            System.out.println("4. Rellenar email");
            System.out.println("5. Finalizar");
            opciones = sc.nextInt();
            sc.nextLine();

            switch(opciones){
                case 1:
                    System.out.println("Introduce tu nombre: ");
                    nombreUser = sc.nextLine();
                    try {
                        if(!nombreUser.matches("[a-zA-Z\\s']+")){
                            throw new TipoDatoIncorrectoException ("solo puedes introducir letras.");
                        }
                    } catch (TipoDatoIncorrectoException e) {
                        System.out.println(e.getMessage());
                    }

                    flagName = true;
                    break;
                case 2:

                    System.out.println("Introduce tu apellido: ");
                    apellidoUser = sc.nextLine();
                    try {
                        if(!apellidoUser.matches("[a-zA-Z\\s']+")){
                            throw new TipoDatoIncorrectoException ("solo puedes introducir letras.");
                        }
                    } catch (TipoDatoIncorrectoException e) {
                        System.out.println(e.getMessage());
                    }

                    flagApellido = true;
                    break;
                case 3:
                    System.out.println("Introduce tu DNI");
                    dniUser = sc.nextLine();
                    try {
                        if(dniUser.length() != 9){
                            throw new LongitudDNINoValidaException ("tu DNI debe tener nueve dígitos");
                        }

                        try {
                           char ultimaLetra = dniUser.charAt(dniUser.length()-1);
                           if(!Character.isLetter(ultimaLetra)){
                            throw new UltimoDigitoNoLetraException ("El último caracter de tu DNI debe ser una letra");
                           } 
                        } catch (UltimoDigitoNoLetraException e) {
                            System.out.println(e.getMessage());
                        }

                        try {
                            char soloNumeros = dniUser.charAt(dniUser.length()-8);
                            if(!Character.isDigit(soloNumeros)){
                                throw new NumeracionContieneLetrasException ("los primeros 8 digitos de tu DNI deben ser unicamente números");
                            }
                        } catch (NumeracionContieneLetrasException e) {
                            System.out.println(e.getMessage());
                        }

                    } catch (LongitudDNINoValidaException e) {
                        System.out.println(e.getMessage());
                    }

                    flagDNI = true;
                    break;
                case 4:
                    System.out.println("Introduce tu email");
                    emailUser = sc.nextLine();
                    try {
                        if(!emailUser.contains("@") || !emailUser.contains(".")){
                            throw new EmailIncorrectoException ("tu email debe contener @ y .");
                        }
                    } catch (EmailIncorrectoException e) {
                        System.out.println(e.getMessage());
                    }

                    flagEmail = true;
                    break;
                case 5:
                    if(flagName && flagApellido && flagDNI && flagEmail){
                        System.out.println("Has rellenado correctamente los datos del formulario. Los datos son:\n" + "Nombre: " + nombreUser + "\n" + "Apellido: " + apellidoUser + "\n" + "DNI: " + dniUser + "\n" + "Email: " + emailUser);
                        salir = true;
                    }else{
                        System.out.println("Te faltan opciones por rellenar");
                        salir = false;
                    }
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
        sc.close();
    }
}
