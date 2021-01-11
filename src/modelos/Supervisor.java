package modelos;

import java.util.List;

public class Supervisor extends Persona{
    private int idSupervisor;
    private double salario;
    private List<Vendedor> vendedoresACargo;
    private int metas;
    private int porcentajeComision;

    public Supervisor(String nombre, String apellido, int dni,
                      int idSupervisor, double salario,
                      List<Vendedor> vendedoresACargo, int metas, int porcentajeComision) {
        super(nombre, apellido, dni);
        this.idSupervisor = idSupervisor;
        this.salario = salario;
        this.vendedoresACargo = vendedoresACargo;
        this.metas = metas;
        this.porcentajeComision = porcentajeComision;
    }

    public int getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(int idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public double getSalario() {
        if (vendedoresACargo == null) {
            return salario;
        }

        double ventasMes = 0;
        for (Vendedor vendedor : vendedoresACargo) {
            ventasMes = ventasMes + vendedor.getCantidadVendidaMes();
        }

        if (ventasMes < metas) {
            System.out.println("No cumplió metas, está advertido!");
            return salario;
        } else {
            System.out.println("Cumplió metas!");
            double comision = ventasMes * porcentajeComision / 100;
            double salarioMes = salario + comision;
            return salarioMes;
        }

    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Vendedor> getVendedoresACargo() {
        return vendedoresACargo;
    }

    public void setVendedoresACargo(List<Vendedor> vendedoresACargo) {
        this.vendedoresACargo = vendedoresACargo;
    }

    public int getMetas() {
        return metas;
    }

    public void setMetas(int metas) {
        this.metas = metas;
    }

    public int getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(int porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "idSupervisor=" + idSupervisor +
                ", nombre=" + getNombre() +
                ", apellido=" + getApellido() +
                ", salario=" + getSalario() +
                ", vendedoresACargo=" + vendedoresACargo +
                ", metas=" + metas +
                ", porcComision=" + porcentajeComision +
                '}';
    }
}
