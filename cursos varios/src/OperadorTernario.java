import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //  estructura / variable = condicion ? si es verdadero: si es falso
        String variable = 7 == 5 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 5.2;

        String materia = "";
        String resulMate = "";
        String resulCiencias = "";
        String resulHistoria = "";

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa la nota de matematicas entre 5.0 - 10.0:");
        matematicas = s.nextDouble();
        resulMate = (matematicas <= 5.9)? "Repobada" : "Aprobado";
        System.out.println("resultado de Matematicas = " + resulMate);


        System.out.println("Ingresa la nota de ciencias entre 5.0 - 10.0:");
        ciencias = s.nextDouble();
        resulCiencias = (ciencias <= 5.9)? "Repobada" : "Aprobado";
        System.out.println("resultado de ciencias = " + resulCiencias);


        System.out.println("Ingresa la nota de historia entre 5.0 - 10.0:");
        historia = s.nextDouble();
        resulHistoria = (historia <= 5.9)? "Repobada" : "Aprobado";
        System.out.println("resultado de historia = " + resulHistoria);

        materia = (matematicas <= 5.9)? "Repobada" : "Aprobado";
        System.out.println("materia = " + materia);


        /*if(matematicas, ciencias, historia <= 5.9) {
            System.out.println("Tienes materias repobadas favor de pasar a oficinas " );
        } else {
            System.out.println("Felicidades no tienes materias reprobadas!");
        }*/

        promedio = (matematicas + ciencias + historia) / 3 ;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 6.0 ? "Aprobado": "Rechazado";
        System.out.println("estado = " + estado);



        /*if(promedio >= 5.49) {
            estado = "Aprobado";
        } else {
            estado = "Rechazado";
        } es lo mismo que la linea 10 */


    }
}
