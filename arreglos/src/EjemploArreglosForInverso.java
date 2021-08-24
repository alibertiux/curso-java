import java.util.Arrays;

public class EjemploArreglosForInverso {
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
        /*for(int i = 0; i < total; i++){
            System.out.println("para indice  " + i + " : " + productos[i]);
        }*/
        System.out.println();
        System.out.println("========= Usando For inverso =========");

        for(int i = 0; i < total; i++){
            System.out.println("para i  " + (total-1-i) + " : " + productos[total-1-i]);
        }

        System.out.println();
        System.out.println("========= Usando For inverso 2 =========");

        for(int i = total-1; i >= 0; i--){
            System.out.println("para i = " + productos[i]);
        }
    }

}
