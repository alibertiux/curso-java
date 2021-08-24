import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.println("Dame tu usuario");
        /*byte num = n.nextByte();

        switch (num){
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
            case 4:
                System.out.println("El numero es cuatro");
                break;
            default:
                System.out.println("Numero invalido");

        }*/
        String  nombre = n.next();

                switch (nombre) {
                    case "0":
                        System.out.println("El usuario es Bertha");
                        break;
                    case "1":
                        System.out.println("El usuario es Gil");
                        break;
                    case "2":
                        System.out.println("El usuario es Mary");
                        break;
                    case "3":
                        System.out.println("El usuario es Chuy");
                        break;
                    case "4":
                        System.out.println("El usuario es Alicia");
                        break;
                    default:
                        System.out.println("Usuario invalido");

                }
    }
}
