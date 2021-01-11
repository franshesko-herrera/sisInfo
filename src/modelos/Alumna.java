package modelos;

public class Alumna extends Persona{

    private int codEstudiantil;

    public Alumna(String nombre, String apellido, int dni, int codEstudiantil) {
        super(nombre, apellido, dni);
        this.codEstudiantil = codEstudiantil;
    }

    public int getCodEstudiantil() {
        return codEstudiantil;
    }

    public void setCodEstudiantil(int codEstudiantil) {
        this.codEstudiantil = codEstudiantil;
    }

    @Override
    public String toString() {
        return "Alumna{" +
                "nombre=" + getNombre() +
                ", apellido=" + getApellido() +
                ", codEstudiantil=" + codEstudiantil +
                ", dni=" + getDni() +
                '}';
    }
}
