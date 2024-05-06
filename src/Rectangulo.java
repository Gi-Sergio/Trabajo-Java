public class Rectangulo extends FiguraGeometrica{
    private Integer base;
    private Integer altura;

    public Rectangulo(String nombre, String color, Integer base, Integer altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
}
