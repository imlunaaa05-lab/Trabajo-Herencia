
class FiguraGeometrica {

    String nombre;
    int lados;
    int angulos;

    public FiguraGeometrica(String nombre, int lados, int angulos) {
        this.nombre = nombre;
        this.lados = lados;
        this.angulos = angulos;
    }

    public void mostrarInfo() {
        System.out.println("Figura: " + nombre);
        System.out.println("Lados: " + lados);
        System.out.println("Ángulos: " + angulos);
    }
}


class Triangulo extends FiguraGeometrica {

    double base, altura;

    public Triangulo(double base, double altura) {
        super("Triangulo", 3, 3);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
}


class Cuadrado extends FiguraGeometrica {

    double lado;

    public Cuadrado(double lado) {
        super("Cuadrado", 4, 4);
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}


class Circulo extends FiguraGeometrica {

    double radio;

    public Circulo(double radio) {
        super("Circulo", 0, 0);
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}


public class Main {
    public static void main(String[] args) {

        Triangulo t = new Triangulo(6,4);
        Cuadrado c = new Cuadrado(5);
        Circulo ci = new Circulo(3);

        t.mostrarInfo();
        System.out.println("Área: " + t.calcularArea());
        System.out.println();

        c.mostrarInfo();
        System.out.println("Área: " + c.calcularArea());
        System.out.println();

        ci.mostrarInfo();
        System.out.println("Área: " + ci.calcularArea());
    }
}
