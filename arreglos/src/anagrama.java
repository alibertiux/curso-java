import java.util.Arrays;

public class anagrama {
    public static void main(String[] args) {

        String palabra1 = "roma";
        String palabra2 = "amor";
        char[] arreglo1 = palabra1.replaceAll(" ", "").toCharArray();
        char[] arreglo2 = palabra2.replaceAll(" ", "").toCharArray();
        System.out.println("arreglo1 = " + palabra1);
        System.out.println("arreglo2 = " + palabra2);
        ;

        int total1 = arreglo1.length;
        int total2 = arreglo2.length;


        Arrays.sort(arreglo1);
        Arrays.sort(arreglo2);

        boolean esAnagrama = false;

        if (arreglo1 != arreglo2){
                    }
       /* for(int i = 0; i < total1; i++) {
            System.out.println("i = " + arreglo1[i]);
            for(int j = 0; j < total2; j++){
                System.out.println("j = " + arreglo1[i]);
                if (arreglo1[i] != arreglo2[i]) {
                    esAnagrama = false;
                }*/
            }

        }


