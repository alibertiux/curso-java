public class EjemploString {
    public static void main(String[] args) {
    String curso = "Programacion Java";
    String curso2 = new String("Programacion Java");
    String curso2_1 = "programacion java";
    String curso3 = "Programacion Java";


    boolean esIgual = curso == curso2; // compara solo instancia retorna false
    System.out.println("esIgual = " + esIgual);

    esIgual = curso.equals(curso2); // compara valor retorna true
    System.out.println("esIgual = " + esIgual);

    esIgual = curso.equalsIgnoreCase(curso2_1); // compara valor sin importar may /min retorna true porque es el mismo valor
    System.out.println("esIgual = " + esIgual);
    
    esIgual = curso == curso3;
    System.out.println("esIgual = " + esIgual); // compara la instancia retorna true





    }
}
