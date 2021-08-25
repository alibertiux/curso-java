package org.bramirez.ejemplos.set;

import org.bramirez.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        /**
         * Al utilizar un for en una lista se imprimen de la forma en que fueron ingresando
         * Solo las listas se puede utilizar un for tradicional ya que tienen opcion a ingresar con el get
         */
        //List<Alumno> sa = new ArrayList<>();

        /**
         * También nos permite iterar con todos todos los for igual que Arraylist
         * Mantiene el orden en el cual se agregan los elementos
         * Tiene en metodo get para iterar con un for clasico
         */
        List<Alumno> sa = new LinkedList<>();


        sa.add(new Alumno("Pato ",5));
        sa.add(new Alumno("Cata ",6));
        sa.add(new Alumno("Luci ",4));
        sa.add(new Alumno("Jano ",7));
        sa.add(new Alumno("Andres ",3));
        sa.add(new Alumno("Zeus ",2));
        sa.add(new Alumno("Zeus2 ",2));
        sa.add(new Alumno("Lucas ",2));
        sa.add(new Alumno("Zeus ",3));
        /**
         * para ordenar utilizamos la clase Collections y el metodo short
         */
        //Collections.sort(sa);
        /**
         * Al sobreescribir el comportamiento de sort, se hace una implementacion de comparator.
         * el sort tiene sobre carga comparator
         */
        //Collections.sort(sa, (a, b) -> b.getNota().compareTo(a.getNota()));
        /**
         *este metodo sort es mas factible si se utilizar el metodo sor que tiene la lista
         */
        //sa.sort((a, b) -> b.getNota().compareTo(a.getNota()));
        /**
         * Utilizando java 8 en la interfaz comparator y el metodo comparing, mas facil con una expresion lamda
         * timpo de dato y variable expresion lamda y ordenamiento por el atributo, y metodo reversed
         */
        //sa.sort(Comparator.comparing((Alumno a) -> a.getNota()).reversed());
        /**
         * nomenclatura metodo de referencia
         * al tipo se quita la variable, la expresion lamda y el objeto de la variable y los parentesis del metodo
         * y agregamos :: entre el tipo y el ordenamiento del atributo
         */
        sa.sort(Comparator.comparing(Alumno::getNota).reversed());

        System.out.println(sa);

        /*
        System.out.println();
        System.out.println("Utilizando un for clasico  'ojo' solo en listas");
        for(int i = 0; i < sa.size(); i++){
            Alumno a = sa.get(i);
            System.out.println(a);
        }

        System.out.println();
        System.out.println("Iterando usando un forEach");// un for convencional en un set no se pude
        for (Alumno a: sa) {
            System.out.println(a.getNombre());
        }

        System.out.println();
        System.out.println("Iterando usando while e iterator");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }
        System.out.println();
        System.out.println("Iterando usando Stream forEach");
        sa.forEach(a -> System.out.println(a));

         */

        System.out.println();
        System.out.println("Iterando usando Stream forEach forma optimizada de forEach API colection");
        sa.forEach(System.out::println);




    }
}
