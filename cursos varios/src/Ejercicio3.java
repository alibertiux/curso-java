public class Ejercicio3 {
    public static void main(String[] args) {
        /*hacer un programa que muestre los digitos de un numero de 5 digitos de la sig forma
        n=23895 e imprimir de la siguiente manera
        5
        59
        598
        5983
        59832
        */

        String numero = "23895";
        String invertido = "";

        for (int i = numero.length() - 1; i >= 0; i--) {
            invertido += numero.charAt(i);
            System.out.println("" + invertido);
        }
        System.out.println("numero original: " + numero);
        System.out.println("numero invertido: " + invertido);






        /*char [] arreglo = invertido.toCharArray();
        System.out.println("" + arreglo[0]);
        System.out.println("" + arreglo[0]+" "+arreglo[1]);
        System.out.println("" + arreglo[0]+" "+arreglo[1]+" "+arreglo[2]);
        System.out.println("" + arreglo[0]+" "+arreglo[1]+" "+arreglo[2]+" "+arreglo[3]);
        System.out.println("" + arreglo[0]+" "+arreglo[1]+" "+arreglo[2]+" "+arreglo[3]+" "+arreglo[4]);*/



    }
    }