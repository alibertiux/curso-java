public class EjemploArreglosForOrdenamientoBurbujaObjeto {
    public static void sortBurbuja(Object[] arreglo){

        int total = arreglo.length;
        int contador = 0;

        for(int i = 0; i < total -1; i++){

            for(int j = 0; j < total-1 -i; j++){
                if( ((Comparable) arreglo[i]).compareTo(arreglo[j]) < 0){
                    Object auxiliar = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }

    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generacion", "Bicicleta Oxford"};

        int total = productos.length;

        sortBurbuja(productos);
        for(int i = 0; i < total; i++){
            System.out.println(" para indice " + i + " : " + productos[i]);
        }


        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);

        for(int i = 0; i < numeros.length; i++){
            System.out.println("i = " + i + " : " + numeros[i]);
        }


    }

}
