import java.util.Scanner;

public class LoginArray {
        public static void main(String[] args) {

            /*String[] usernames = new String[2];
            String[] passwords = new String[2];

            usernames[0] ="Bertha";
            passwords[0] ="8712";

            usernames[1] = "Admin";
            usernames[1] = "123456";

            usernames[1] = "Pepe";
            usernames[1] = "12345";*/

            String[] usernames = {"Bertha", "Admin", "Pepe"};
            String[] passwords = {"8712", "123456", "12345"};

            Scanner scanner = new Scanner(System.in); //objeto scanner

            System.out.println("Ingrese el username");
            String u = scanner.next();

            System.out.println("Ingrese el password");
            String p = scanner.next();

            boolean esAutenticado = false;
            for(int i = 0; i < usernames.length; i++){
                if( (usernames[i].equalsIgnoreCase(u) && passwords[i].equals(p)) ) {
                    esAutenticado = true;
                    break;
                }

            }
            if(esAutenticado){
                System.out.println("Bienvenido usuario ".concat(u).concat("!"));
            } else {
                System.out.println("Lo siento, requiere autenticación");
                System.out.println("username o password incorrectos!");
            }


    }
}
