public class EjemploStringConcatenacion {
    public static void main(String[] args) {
    String curso = "Programacion Java";
    String profesor = "Andres Guzman";
    String detalle = curso + " con el instructor " + profesor; //aqui solo concatena
    System.out.println(detalle);

    int numeroA = 10;
    int numeroB = 5;
    int costo = numeroA + numeroB;

    System.out.println( detalle + numeroA + numeroB); // aqui solo concatena todo lineal no separa si queremos suma los enteros
    System.out.println(detalle + (numeroA + numeroA)); // aqui nos respeta por si queremos sumar los enteros

    String detalle2 = curso.concat(curso).concat(" con ").concat(profesor).concat(" precio del curso" + " " + costo);
        System.out.println(detalle2);





    }
}
