package modelos;

public class Paciente extends Persona{
    private int credencial;
    private ServicioSocial servicioSocial;

    public Paciente(String nombre, String apellido, int dni, int credencial, ServicioSocial servicioSocial) {
        super(nombre, apellido, dni);
        this.credencial = credencial;
        this.servicioSocial = servicioSocial;
    }

    public int getCredencial() {
        return credencial;
    }

    public void setCredencial(int credencial) {
        this.credencial = credencial;
    }

    public ServicioSocial getServicioSocial() {
        return servicioSocial;
    }

    public void setServicioSocial(ServicioSocial servicioSocial) {
        this.servicioSocial = servicioSocial;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre = " + getNombre() +
                ", apellido = " + getApellido() +
                ", credencial = " + credencial +
                ", servicioSocial = " + servicioSocial +
                '}';
    }
}
