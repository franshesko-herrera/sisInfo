package modelos;

public class ServicioSocial {
    private String nombrePlan;
    private int tipoPlan;

    public ServicioSocial(String nombrePlan, int tipoPlan) {
        this.nombrePlan = nombrePlan;
        this.tipoPlan = tipoPlan;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public int getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(int tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    @Override
    public String toString() {
        return "ServicioSocial{" +
                "nombrePlan='" + nombrePlan + '\'' +
                ", tipoPlan='" + tipoPlan + '\'' +
                '}';
    }
}
