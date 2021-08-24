package org.bramirez.ejemplo;

import org.bramirez.pooherencia.Alumno;
import org.bramirez.pooherencia.AlumnoInternacional;
import org.bramirez.pooherencia.Persona;
import org.bramirez.pooherencia.Profesor;

public class EjemploHerenciaConstructores {

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
        System.out.println("imprimiendo los datos del tipo persona");
        System.out.println("nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                +", email: " + persona.getEmail());

        if(persona instanceof Alumno){
            System.out.println("imprimiendo los datos del tipo Alumno");
            System.out.println("Institucion: " + ((Alumno)persona).getInstitucion());
            System.out.println("nota matematicas: " + ((Alumno)persona).getNotaMatematica());
            System.out.println("nota historia: " + ((Alumno)persona).getNotaHistoria());
            System.out.println("nota castellano: " + ((Alumno)persona).getNotaCastellano());
            System.out.println("promedio: " + ((Alumno) persona).calcularPromedio()
            );
            if(persona instanceof AlumnoInternacional){
                System.out.println("imprimiendo los datos del tipo AlumnoInternacional");
                System.out.println("nota ideiomas: " + ((AlumnoInternacional)persona).getNotaIdiomas());
                System.out.println("pais: " + ((AlumnoInternacional)persona).getPais());
            }
            System.out.println("====================== sobre escritura promedio ===========================");
            System.out.println("promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("====================== sobre escritura promedio ===========================");
        }

        if(persona instanceof Profesor){
            System.out.println("imprimiendo los datos del tipo Profesor");
            System.out.println("Asignatura: " + ((Profesor)persona).getAsignatura());
        }
        System.out.println("====================== sobre escritura saludar ===========================");
        System.out.println(persona.saludar());

        System.out.println("=================================================");
    }
}

