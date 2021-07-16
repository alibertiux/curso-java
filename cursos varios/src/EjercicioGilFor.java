public class EjercicioGilFor {
    public static void main(String[] args) {
        int num = 5;
        int resultado = 0;

        for( int i = 1; i <= num; i++) {
            System.out.println("num = " + i);
            resultado = resultado + i;
            System.out.println("resultado = " + resultado);
        }
    }
}
