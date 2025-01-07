import org.efajardo.herencia.Alumno;
import org.efajardo.herencia.AlumnoInternacional;
import org.efajardo.herencia.Profesor;

public class Main {
    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        alumno.setNombre("Edson");
        alumno.setApellidos("Fajardo Ramirez");
        alumno.setEdad(39);
        alumno.setInstitucion("Universidad Nacional de Ucayali");
        alumno.setNotaBd("20");
        alumno.setNotaMatematica("20");
        alumno.setNotaPoo("19");
        System.out.println("Alumno : "+ alumno.getNombre() + " "+ alumno.getApellidos());

        Profesor profesor =new Profesor();
        profesor.setNombre("Victor");
        profesor.setApellidos("Ayra Apac");
        profesor.setEdad(50);
        profesor.setCurso("Programacion Orientada a Objetos");
        System.out.println("Profesor : "+ profesor.getNombre() + " "+profesor.getApellidos()+ " del curso "+profesor.getCurso());

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Freddy");
        alumnoInternacional.setApellidos("Medina Fajardo");
        alumnoInternacional.setEdad(43);
        alumnoInternacional.setNotaBd("15");
        alumnoInternacional.setPais("USA");
        alumnoInternacional.setNotaIdioma("20");
        System.out.println("Alumno internacional : "+alumnoInternacional.getNombre()+" "
                +alumnoInternacional.getApellidos() +" de "+alumnoInternacional.getPais());

        Class clase = alumnoInternacional.getClass();
        while (clase.getSuperclass()!= null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija+" es una clase hija de la clase padre "+ padre);
            clase = clase.getSuperclass();
        }

    }
}