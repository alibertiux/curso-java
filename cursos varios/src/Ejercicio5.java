import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {

        int numero = 0;
        Integer resultado = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero");
        numero = scanner.nextInt();

        for(int i = 1;  i <= 100; i++){
            resultado = i * numero;

            System.out.println(resultado);


        }
    }
}
