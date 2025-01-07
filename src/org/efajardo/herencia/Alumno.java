package org.efajardo.herencia;

public class Alumno extends Persona{
    private String notaMatematica;
    private String notaPoo;
    private String notaBd;
    private String institucion;

    public String getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(String notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public String getNotaPoo() {
        return notaPoo;
    }

    public void setNotaPoo(String notaPoo) {
        this.notaPoo = notaPoo;
    }

    public String getNotaBd() {
        return notaBd;
    }

    public void setNotaBd(String notaBd) {
        this.notaBd = notaBd;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
}
