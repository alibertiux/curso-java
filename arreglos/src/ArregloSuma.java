import java.util.Scanner;
public class ArregloSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //objeto scanner

        System.out.println("Dame un numero");
        int numero = scanner.nextInt();
        String[] arrNumeros = new String[numero];

        int suma = 0;

        for (int i = 0; i < arrNumeros.length; i++){
            arrNumeros[i] = String.valueOf(i+1);
            suma = suma + Integer.parseInt(arrNumeros[i]);

        }

        System.out.println("suma = " + suma);



    }
}
