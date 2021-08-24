package org.bramirez.ejemplo;

import org.bramirez.pooherencia.Alumno;
import org.bramirez.pooherencia.AlumnoInternacional;
import org.bramirez.pooherencia.Persona;
import org.bramirez.pooherencia.Profesor;

public class EjemploHerenciaToSting {

    public static void main(String[] args) {

        System.out.println("======== Creando la instancia de la clase Alumno ======");
        Alumno alumno = new Alumno("Bertha", "Ramirez", 34, "Instituto Nacional");
        //alumno.setNombre("Bertha Alicia");
        //alumno.setApellido("Ramirez Mora"); //((Alumno)alumno).setInstitucion("Instituto Nacional")// casteo
        //alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("bertha@correo.com");

        System.out.println("======== Creando la instancia de la clase AlumnoInternacional ======");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter","Gosling","Australia");
        /*alumnoInt.setNombre();
        alumnoInt.setApellido();
        alumnoInt.setPais();*/
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("peter@correo.com");

        System.out.println("======== Creando la instancia de la clase Profesor ======");
        Profesor profesor = new Profesor("Ana", "Jimenez","Matematicas");
        /*profesor.setNombre("Ana");
        profesor.setApellido("Jimenez");
        profesor.setAsignatura("Matematicas");*/
        profesor.setEdad(37);
        profesor.setEmail("ana@correo.com");

        System.out.println("=============");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona) {
        System.out.println("=============");
        System.out.println(persona);

    }
}

