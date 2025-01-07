package org.efajardo.herencia;

public class AlumnoInternacional extends Alumno{

    private String pais;
    private String notaIdioma;

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
