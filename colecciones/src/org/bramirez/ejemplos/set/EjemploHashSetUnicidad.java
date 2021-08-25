package org.bramirez.ejemplos.set;

import org.bramirez.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        /**
         * HashSet y TreeSet al utilizar un for lo muestra aleatoriamente
         * Los Set no tienen metodo get
         */
        Set<Alumno> sa = new HashSet<>();

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
        //List<Alumno> sa = new LinkedList<>();


        sa.add(new Alumno("Pato ",5));
        sa.add(new Alumno("Cata ",6));
        sa.add(new Alumno("Luci ",4));
        sa.add(new Alumno("Jano ",7));
        sa.add(new Alumno("Andres ",3));
        sa.add(new Alumno("Zeus ",2));
        sa.add(new Alumno("Zeus2 ",2));
        sa.add(new Alumno("Lucas ",2));
        sa.add(new Alumno("Zeus ",3));
        System.out.println(sa);

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

        System.out.println();
        System.out.println("Iterando usando Stream forEach forma optimizada de forEach API colection");
        sa.forEach(System.out::println);

        /*
        System.out.println();
        System.out.println("Utilizando un for clasico  'ojo' solo en listas");
        for(int i = 0; i < sa.size(); i++){
            Alumno a = sa.get(i);
            System.out.println(a);
        }
        */


    }
}
