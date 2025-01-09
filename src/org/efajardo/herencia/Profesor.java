package org.efajardo.herencia;

public class Profesor extends Persona{

    private String curso;

    public Profesor() {
    }

    public Profesor(String nombre, String apellidos, String curso) {
        super(nombre, apellidos);
        this.curso = curso;
    }

    public Profesor(String nombre, String apellidos, int edad, String email, String curso) {
        super(nombre, apellidos, edad, email);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
