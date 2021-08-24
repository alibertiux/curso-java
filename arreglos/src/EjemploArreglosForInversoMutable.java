import java.util.Arrays;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "90";
        productos[1] = "20";
        productos[2] = "15";
        productos[3] = "30";
        productos[4] = "45";
        productos[5] = "70";
        productos[6] = "80";
        System.out.println("========= Usando For sin ordenear solo mostrar =========");
        for(int i = 0; i < total; i++){
            System.out.println("para indice  " + i + " : " + productos[i]);
        }

        Arrays.sort(productos);
        System.out.println();
        System.out.println("========= Usando For ordenado =========");

        for(int i = 0; i < total; i++){
            System.out.println("para indice  " + i + " : " + productos[i]);
        }
        System.out.println();
        System.out.println("========= Usando For para invertir una vez ordenado =========");
/*
        for( int i = 0; i < total/2; i++){
            String actual = productos[i];
            String inverso = productos[total-1-i];

            productos[i] = inverso;
            productos[total-1-i] = actual;


        }
        */
        int total2 = productos.length;
        for( int i = 0; i < total2; i++){
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-1-i] = actual;
            total2--;
        }
        for(int i = 0; i < total; i++) {
            System.out.println("para indice  " + i + " : " + productos[i]);
        }
    }


}
