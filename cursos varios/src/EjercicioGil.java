import javax.lang.model.SourceVersion;

public class EjercicioGil {
    public static void main(String[] args) {

        String nombre = "Gilberto";
        String apellido ="Ramirez Mora";

        // 1
        System.out.println("Tu nombre tiene   = " + nombre.length() + " caracteres");
        System.out.println("Tu apellido tiene = " + apellido.length() + " caracteres");

        // 2
        System.out.println("las 3 primeras letras de tu apellido son = " + apellido.substring(0, 3));

        // 3
        String nombreCompleto = nombre.concat(" ").concat(apellido);
        System.out.println("Tu nombre completo es " +nombreCompleto);
        
        // 4
        System.out.println("Tu nombre tiene espacios en blanco? = " + nombreCompleto.contains(" "));
        System.out.println("Tiene el mismo contenido nombre y apellido? = " + nombre.equals(apellido));


    }
}
