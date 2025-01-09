package org.efajardo.herencia;

public class AlumnoInternacional extends Alumno{

    private String pais;
    private String notaIdioma;

    public AlumnoInternacional() {
    }

    public AlumnoInternacional(String nombre, String apellidos){
        super(nombre, apellidos);
    }

    public AlumnoInternacional(String nombre, String apellidos, String notaMatematica, String notaPoo, String notaBd, String institucion, String pais, String notaIdioma) {
        super(nombre, apellidos, notaMatematica, notaPoo, notaBd, institucion);
        this.pais = pais;
        this.notaIdioma = notaIdioma;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNotaIdioma() {
        return notaIdioma;
    }

    public void setNotaIdioma(String notaIdioma) {
        this.notaIdioma = notaIdioma;
    }
}
