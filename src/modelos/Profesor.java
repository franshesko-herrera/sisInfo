package modelos;

public class Profesor extends Persona{

    private Curso curso;

    public Profesor(String nombre, String apellido, int dni, Curso curso) {
        super(nombre, apellido, dni);
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + getNombre() + '\'' +
                "apellido='" + getApellido() + '\'' +
                "curso=" + curso +
                '}';
    }
}
