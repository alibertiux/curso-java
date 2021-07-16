public class SentenciaForEach {
    public static void main(String[] args) {

        int [] nuemroImpar = {1, 3, 5, 7, 9, 11, 13, 15};
        System.out.println("los numeros del arreglo son:");
        for(int num: nuemroImpar){
            System.out.println(" " + num);
        }
        System.out.println("---------------------------------------------------");

        String [] nombres = {"Andres", "pepe", "maria", "paco", "lalo", "bea", "pato", "pepa"};
        System.out.println("los nombres del arreglo son:");
        for(String nombre : nombres){
            System.out.println("" + nombre);
        }
        System.out.print("---------------------------------------------------");

        bucle1:
        for(int i = 0; i <= 7; i++){
            System.out.println();
            for(int j = 0; j <= 8; j++){
                if(i == 2){
                    continue bucle1;
                }
                System.out.print("[i =" + i + ", j = " + j + " ], ");
            }
        }
        System.out.print("\n---------------------------------------------------");



        bucle:
        for(int i = 1; i <= 7; i++){
            int j = 1;
            while ( j <= 8 ){
                if(i == 6 || i == 7){
                    System.out.println("Dia" + i + ": Descanso de fin de semana!");
                    continue bucle;
                }
                System.out.println("Dia " + i + ", Trabajo a las " + j + "hrs. ");
                j++;
            }
        }
        System.out.print("\n---------------------------------------------------");


    }
}
