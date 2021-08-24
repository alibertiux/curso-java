public class Ejercicio4 {
    public static void main(String[] args) {
       /*
        imprimir un numero n = 12345 e imprimirlo de la siguiente manera
        5
        45
        345
        2345
        12345
         */
        String numero2 = "12345";
        String resultado = "";
        //System.out.println("n = " + numero2);

        char [] arreglo2 = numero2.toCharArray();

        for(int i=numero2.length()-1; i>=0; i--){
            resultado = numero2.charAt(i)+ resultado;
            System.out.println("" + resultado);
        }







       /* System.out.println("" + arreglo2[4]);
        System.out.println("" + arreglo2[3]+" "+arreglo2[4]);
        System.out.println("" + arreglo2[2]+" "+arreglo2[3]+" "+arreglo2[4]);
        System.out.println("" + arreglo2[1]+" "+arreglo2[2]+" "+arreglo2[3]+" "+arreglo2[4]);
        System.out.println("" + arreglo2[0]+" "+arreglo2[1]+" "+arreglo2[2]+" "+arreglo2[3]+" "+arreglo2[4]);*/

        /*for (int indice = cadena.length() - 1; indice >= 0; indice--) {
            // Y vamos concatenando cada carácter a la nueva cadena
            invertida += cadena.charAt(indice);
        }*/


    }
    }