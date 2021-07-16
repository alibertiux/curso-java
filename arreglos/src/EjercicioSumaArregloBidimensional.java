import java.util.Scanner;

public class EjercicioSumaArregloBidimensional {
    public static void main(String[] args) {

        int[][] a, b, c;
        int tamaño = 2;
        a = new int[tamaño][tamaño];
        b = new int[tamaño][tamaño];
        c = new int[tamaño][tamaño];

        Scanner p = new Scanner(System.in);

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.println("ingrese un numero para el arreglo a");
                a[i][j] = p.nextInt();
                System.out.println("ingrese un numero para el arreglo b");
                b[i][j] = p.nextInt();

            c[i][j] = a[i][j] + b[i][j];
            //System.out.println("la suma es " + c[i]);
            }
        }
        int aux = 0;
        System.out.println("la suma de tu arreglo es: ");
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c.length; j++){
                System.out.print(c[i] [j] + " ");

               // System.out.print(c[i][j] + " ");


            }
            System.out.println();
           }
    }
}
