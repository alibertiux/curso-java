import java.util.Scanner;

public class ArregloSumaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //objeto scanner

        System.out.println("Dame un numero");
        String numero = String.valueOf(scanner.nextInt());
        int[] arrNumero = new int[Integer.parseInt(numero)];

        int suma = 0;

        for (int i = 0; i < arrNumero.length; i++){
            arrNumero[i] = Integer.parseInt(String.valueOf(i+1));
            suma = suma + Integer.parseInt(String.valueOf(arrNumero[i]));

        }

        System.out.println("suma = " + suma);



    }
}
