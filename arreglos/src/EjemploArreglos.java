public class EjemploArreglos {
    public static void main(String[] args) {

        int[] numeros = new int[4];

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

        System.out.println("posicion 1 = " + numeros[0]);
        System.out.println("posicion 2 = " + numeros[1]);
        System.out.println("posicion 3 = " + numeros[2]);
        System.out.println("posicion 4 = " + numeros[3]);

        System.out.println();
        Integer numero = Integer.valueOf("5"); //autoboxing
        int i = Integer.valueOf("2"); //unboxing

        System.out.println("numero = " + numero);
        System.out.println("i = " + i);


    }

}
