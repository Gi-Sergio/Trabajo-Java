public class Circulo extends FiguraGeometrica{
    private Integer radio;

    public Circulo(String nombre, String color, Integer radio) {
        super(nombre, color);
        this.radio = radio;
    }
    public void calcularArea(){
        System.out.println("El area de este circulo es de: \n" + (3.14*this.radio*this.radio) + "cm^2");
    }

    public void calcularPerimetro(){
        System.out.println("El perimetro de este rectangulo es de: \n" + (2*3.14*this.radio) + "cm");
    }
}
