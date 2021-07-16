import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "monitor";
        productos[1] = "cpu";
        productos[2] = "teclado";
        productos[3] = "mouse";
        productos[4] = "disco duro";
        productos[5] = "tarjeta madre";
        productos[6] = "bocinas";

        System.out.println();
        System.out.println("========= Usando For =========");
        Arrays.sort(productos);
        for(int i = 0; i < total; i++){
            System.out.println("para indice  " + i + " : " + productos[i]);
        }
        System.out.println();
        System.out.println("========= Usando Foreach =========");

        for (String prod: productos) {
            System.out.println("para indice = " + prod);
            
        }

        System.out.println();
        System.out.println("========= Usando While =========");

        int i = 0;
        while (i < total){
            System.out.println("para indice = " + productos[i]);
            i++;
        }

        System.out.println();
        System.out.println("========= Usando Do While =========");

        int j = 0;
        do {
            System.out.println("para indice  " + j + " : " + productos[j]);
            j++;
        } while(j < total);

        System.out.println();
        System.out.println("========= Arreglo de enteros usando For =========");


        int[] numeros = new int[10];

        int totalNumeros = numeros.length;
        for(int k = 0; k < totalNumeros; k++) { // para llenar el arreglo
            numeros[k] = k*3;
        }

        for(int k = 0; k < totalNumeros; k++) { // para mostrar en pantalla el arreglo
            System.out.println("numeros : " + numeros[k]);
        }

    }

}
