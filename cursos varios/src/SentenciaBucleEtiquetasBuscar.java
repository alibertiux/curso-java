public class SentenciaBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes trigo trigo trigo trigo trigo trigo trigo trigo trigo trigo trigo trigo trigo trigo trigo trigo tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int max = frase.length();
        int maxFrase = frase.length();
        int maxPalabra = palabra.length();

        int cantidad = 0;

        buscar:
        for (int i = 0; i < maxFrase; i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '"+ palabra+"' en la frase");

        //---------------------------------------------------------------------------------------------


        /*String [] palabras = frase.split(" ");
        int i = 0;
        for(; i < palabras.length; i++){
            System.out.println( palabras[i]);
        }
        System.out.println("tiene  = " + i + " palabras");*/


        //-------------------------------------------------------------------------------------------------
        /*for(int i = 0; i < max; i++){
            if (frase.charAt(i) != 't'){
                continue;
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + "veces el caracter 't' en la frase");
*/
        //-------------------------------------------------------------------------------------------------
    }
}