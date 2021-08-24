public class EjemploArreglosCombinados {
    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[21];
        b = new int[21];
        c = new int[21];

        int contador = 0;
        int aux = 0;

        for(int i = 0, j = 1; i < 20 || j < 21; i = i+2, j = j+2){
            a[i] = i + 1;
            b[j] = (i+1) * 5;
            c[aux++] = a[i];
            c[aux++] = b[j];
            System.out.println("c = " + c[contador++]);
        }
      /*  for(int i  = 0; i < 20; i++){
            a[i] = i+1;
            b[i] = (i+1)*5;
            c[aux++] = a[i];
            c[aux++] = b[i];
            System.out.println(c[contador++]);
        }*/
   /*     System.out.println("contador = " + contador);
    /*    for(int i = 0; i < c.length; i++){
          /*  System.out.println("a = " + a[i]);
            System.out.println("b = " + b[i]);

            System.out.println("c = " + c[i]);
        }*/


    }
}
