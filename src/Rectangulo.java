public class Rectangulo extends FiguraGeometrica{
    private Integer base;
    private Integer altura;

    public Rectangulo(String nombre, String color, Integer base, Integer altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
    public void calcularArea(){
        System.out.println("El area de este rectangulo es de: \n" + (this.base*this.altura) + "cm^2");
    }

    public void calcularPerimetro(){
        System.out.println("El perimetro de este rectangulo es de: \n" + (this.base*2+this.altura*2) + "cm");
    }
}
