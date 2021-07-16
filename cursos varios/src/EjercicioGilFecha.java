import java.util.Scanner;

public class EjercicioGilFecha {
    public static void main(String[] args) {

        int dia = 0 ;
        int mes = 0 ;
        int año = 0 ;
        String fechaNac = "02011987";
        int resultado = 0;

        //fechaNac = s.next()
        System.out.println("Tu fecha de nacimiento es = " + fechaNac);
      //  System.out.println("Tu fecha de nacimiento sin diagonales = " + fechaNac.replaceAll("/",""));

        char [] arreglo = fechaNac.toCharArray();

       // System.out.println("arreglo = " + arreglo [7]);

       for ( int i = 0; i < arreglo.length; i++){
            System.out.println("arreglo = " + arreglo[i]);
            resultado =  resultado+Integer.parseInt(String.valueOf(arreglo[i]) );
           System.out.println("resultado = " + resultado);
        }

        // System.out.println("fecha = "+ );

     /*  Scanner s = new Scanner(System.in);
        System.out.println("Ingresa tu dia de nacimiento = ");
        dia = s.nextInt();
        System.out.println("Ingresa tu mes de nacimiento = ");
        mes = s.nextInt();
        System.out.println("Ingresa tu año de nacimiento = ");
        año = s.nextInt();*/







    }
}
