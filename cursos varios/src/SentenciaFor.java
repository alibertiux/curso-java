public class SentenciaFor {
    public static void main(String[] args) {
        
        for(int i = 0; i <=10; i++){ // muestra numeros del 1 al 10
            System.out.println("i = " + i);
        }
        System.out.println();
        
        for(int i = 10; i >=0; i--){ // muestra numeros del 10 al 1
            System.out.println("i = " + i);
        }
        System.out.println();

        for(int i = 1, j = 10; i < j; i++, j--){ // muenstra comparacion de 2 numeros incremento y decremento
            System.out.println(i + " - " + j);
        }
        System.out.println();

        for(int i = 0; i <= 10; i++){ //muestra numeros impares
            if( i % 2 ==0 ){ /* si la comparacion es true entra continue e incrementa
                                si la comparacion es false entra continue e imprime*/
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println();

        for(int i = 0; i <= 10; i++){ // muestra numeros pares
            if(! (i % 2 ==0) ){ /* si la comparacion es true entra continue e incrementa (otra manera es  if( i % 2 !=0){)
                                   si la comparacion es false entra continue e imprime*/
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
