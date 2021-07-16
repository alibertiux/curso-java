import java.util.Scanner;

public class OperadoresLogicosLoginTernario {
    public static void main(String[] args) {

        /*String username ="Bertha";
        String password ="8712";

        String username2 = "Admin";
        String password2 = "123456";

        Scanner scanner = new Scanner(System.in); //objeto scanner

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        if( (username.equalsIgnoreCase(u) && password.equals(p)) ||
                (username2.equalsIgnoreCase(u) && password2.equals(p)) ){
            esAutenticado = true;
        }else {
            System.out.println("username o password incorrectos!");
        }
        if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Lo siento, requiere autenticación");
        }*/

        String [] usernames = {"bertha", "admin", "gilberto"};
        String [] passwords = {"8712", "1234", "123456"};

        Scanner scanner = new Scanner(System.in); //objeto scanner

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for( int i = 0; i < usernames.length; i++){
            esAutenticado = (usernames[i].equalsIgnoreCase((u)) && passwords[i].equalsIgnoreCase(p))? true: esAutenticado;

            /*if ((usernames.equals(u) && passwords.equals(p)) ){
                esAutenticado = true;
                break;
            }*/
        }
        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!"):
                "Username o contraseña incorrectas!\nLo sentimos, requiere autenticacion";

        /*if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Username o contrasela incorrecta");
            System.out.println("Los siento, requiere autenticacion");
        }*/


    }
}
