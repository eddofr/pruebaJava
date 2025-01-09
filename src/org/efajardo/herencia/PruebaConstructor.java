package org.efajardo.herencia;

public class PruebaConstructor {
    public static void main(String[] args) {
        Persona persona = new Persona("Edson", "Fajardo Ramirez");
        persona.setEdad(39);
        persona.setEmail("eddofr@gmail.com");

        Alumno alumno = new Alumno("Ronaldo", "Fajardo Ruiz", "20","15","14", "Guadalupe");
        alumno.setEdad(10);
        alumno.setEmail("rofajardo@gmail.com");

        Profesor profesor = new Profesor("Oscar", "Ruiz torres","Base de datos");
        profesor.setEdad(50);
        profesor.setEmail("vegeta@gmail.com");

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Jorch","Aveiro Ralhp");
        alumnoInternacional.setPais("Georgia");
        alumnoInternacional.setNotaIdioma("20");

        System.out.println("---------------------------");
        imprimir(persona);
        System.out.println("---------------------------");
        imprimir(alumno);
        System.out.println("---------------------------");
        imprimir(alumnoInternacional);
        System.out.println("---------------------------");
        imprimir(profesor);
    }

    public static void imprimir(Persona persona){
        System.out.println("Imprimiendo Persona");
        System.out.println("Nombre :" + persona.getNombre() + " " + persona.getApellidos());

        if (persona instanceof Alumno){
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota de base de datos: " + ((Alumno) persona).getNotaBd());

            if (persona instanceof AlumnoInternacional){
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
        }
        if (persona instanceof Profesor){
            System.out.println("Curso: "+((Profesor) persona).getCurso());
        }
    }
}
