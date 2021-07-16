import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploArreglosStringOrdenadoSort {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "monitor";
        productos[1] = "cpu";
        productos[2] = "teclado";
        productos[3] = "mouse";
        productos[4] = "disco duro";
        productos[5] = "tarjeta madre";
        productos[6] = "bocinas";

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("productos[0] = " + prod1);
        System.out.println("productos[1] = " + prod2);
        System.out.println("productos[2] = " + prod3);
        System.out.println("productos[3] = " + prod4);
        System.out.println("productos[4] = " + prod5);
        System.out.println("productos[5] = " + prod6);
        System.out.println("productos[6] = " + prod7);






        /*int[] numeros = new int[4];

        numeros[0] = 8;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = 9;
        numeros[3] = 6;
        //numeros[4] = 5; no se puede agregar mas en el arreglo

        /*int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3]; // mostrar el ultimo numeros[numeros.length - 1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);*/
/*
        System.out.println("posicion 1 = " + numeros[0]);
        System.out.println("posicion 2 = " + numeros[1]);
        System.out.println("posicion 3 = " + numeros[2]);
        System.out.println("posicion 4 = " + numeros[3]);

        System.out.println();
        Integer numero = Integer.valueOf("5"); //autoboxing
        int i = Integer.valueOf("2"); //unboxing

        System.out.println("numero = " + numero);
        System.out.println("i = " + i);*/


    }

}
