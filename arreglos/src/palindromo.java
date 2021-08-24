public class palindromo {
    public static void main(String[] args) {
        String palindromo = "anita lava la tina";


        System.out.println("palindromo = " + palindromo);

        char [] arreglo = palindromo.replaceAll(" ","").toCharArray();
        int largo = arreglo.length-1;

        boolean esPalindromo = true;

        for(int i = 0; i < largo/2; i++){

            if( arreglo[i] != arreglo[largo-i]){
                    esPalindromo = false;
                    break;
            }
        }
        System.out.println("es Palindromo = " + esPalindromo);




        
    }
}
