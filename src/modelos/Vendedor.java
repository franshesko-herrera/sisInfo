package modelos;

public class Vendedor extends Persona{
    private int idVendedor;
    private int porcentajeComision;
    private int cantidadVendidaMes;
    private double salario;

    public Vendedor(String nombre, String apellido, int dni,
                    int idVendedor, int porcentajeComision,
                    int cantidadVendidaMes, double salario) {
        super(nombre, apellido, dni);
        this.idVendedor = idVendedor;
        this.porcentajeComision = porcentajeComision;
        this.cantidadVendidaMes = cantidadVendidaMes;
        this.salario = salario;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(int porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public int getCantidadVendidaMes() {
        return cantidadVendidaMes;
    }

    public void setCantidadVendidaMes(int cantidadVendidaMes) {
        this.cantidadVendidaMes = cantidadVendidaMes;
    }

    public double getSalario() {
        double comision = cantidadVendidaMes * porcentajeComision / 100;
        double salarioMes = salario + comision;
        return salarioMes;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "idVendedor=" + idVendedor +
                ", nombre=" + getNombre() +
                ", apellido=" + getApellido() +
                ", porcentajeComision=" + porcentajeComision +
                ", cantidadVendidaMes=" + cantidadVendidaMes +
                ", salario=" + getSalario() +
                '}';
    }
}
