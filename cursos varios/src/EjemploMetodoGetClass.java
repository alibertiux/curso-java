import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola que tal!";

        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackage());
        System.out.println("strClass.getName() = " + strClass);

        System.out.println();


        for(Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }

        System.out.println();


        Integer num = 34;
        Class intClas = num.getClass();
        Class objClas = intClas.getClass().getSuperclass();
        System.out.println("intClas = " + intClas.getSuperclass());
        System.out.println("objClas = " + objClas);


        System.out.println();

        for(Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }



    }
}
