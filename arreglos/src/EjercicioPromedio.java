import java.util.Arrays;
import java.util.Scanner;

public class EjercicioPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menor = 10;

        int mayor = 0;
        String materias;
        System.out.println("cuantas materias vas a ingresar?");
        materias = scanner.next();
        int suma = 0;
        float promedio = 0;
        String[] arrCal = new String[Integer.parseInt(materias)];


        for (int i = 0; i < arrCal.length; i++) {
            System.out.println("Dame la calificación:" + (i + 1));

            arrCal[i] = scanner.next();

            if( Integer.parseInt(arrCal[i]) > 10 ){
                System.out.println("Tiene que se calificacion menor a 10 ");
            }else if( Integer.parseInt(arrCal[i]) < 0){
                    System.out.println("tiene que ser calificacion mayor que 0");
                }
            if (Integer.parseInt(arrCal[i]) < menor) {
                menor = Integer.parseInt(arrCal[i]);
            } else if(Integer.parseInt(arrCal[i]) > mayor) {
                    mayor = Integer.parseInt(arrCal[i]);
                }

            suma = suma + Integer.parseInt(arrCal[i]);
        }
            System.out.println("tu menor calificacion es: " + menor);
            System.out.println("tu mayor calificacion es: " + mayor);
            System.out.println("suma = " + suma);
            promedio = suma / Float.valueOf(materias);
            System.out.println("tu promedio es : " + promedio);


            // for( int i = 0; i < Largo; i++){

            //   }



    }
}

