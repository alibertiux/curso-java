import java.util.Scanner;

public class EjercicioTresArreglos {
    public static void main(String[] args) {

        int[] a,b,c;
        int tamaño = 4;
        a = new int[tamaño];
        b = new int[tamaño];
        c = new int[tamaño];

        Scanner p = new Scanner(System.in);

        for(int i = 0; i < c.length; i++){
            System.out.println("ingrese un numero para el arreglo a");
            a[i] = p.nextInt();
            System.out.println("ingrese un numero para el arreglo b");
            b[i] = p.nextInt();
            c[i] = a[i] + b[i];
            //System.out.println("la suma es " + c[i]);
        }
        System.out.println("la suma de tu arreglo es: ");
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }





    }
}
