public class ejercicio1 {
    public static void main(String[] args) {

        String abc = "abcdefghijklmnopqrstuvwxyz";

        System.out.println("El abecedario tiene " + abc.length ()+" letras");
        System.out.println("la letra en la posicion 7 es  = " + abc.charAt(6));

        char[] arreglo = abc.toCharArray();
        int largo = arreglo.length;
        for( int i = 0; i < largo; i++){
            System.out.println("abecedario " + arreglo[i]);
        }



    }
}
