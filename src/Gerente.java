public class Gerente extends Empleado{
    private double bono;

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

    public double calcularSalario(){
        return super.calcularSalario() + bono;
    }
}
