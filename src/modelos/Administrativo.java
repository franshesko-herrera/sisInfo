package modelos;

public class Administrativo extends Persona{

    private String cargo;

    public Administrativo(String nombre, String apellido, int dni, String cargo) {
        super(nombre, apellido, dni);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "nombre='" + getNombre() + '\'' +
                "apellido='" + getApellido() + '\'' +
                "cargo='" + cargo + '\'' +
                '}';
    }
}
