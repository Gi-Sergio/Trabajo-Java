public class Vendedor extends Empleado{
    private double comision;

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public Vendedor(String nombre, double salario) {
        super(nombre, salario);
    }

    public double calcularSalario(){
        return super.calcularSalario() + comision;
    }
}
