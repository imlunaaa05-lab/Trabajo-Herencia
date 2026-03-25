class Figura {
    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }
}


class Triangulo extends Figura {
    double base, altura, lado1, lado2, lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}


class Rectangulo extends Figura {
    double ancho, alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }

    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
}


class Circulo extends Figura {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}


public class Main {
    public static void main(String[] args) {

        Figura t = new Triangulo(5, 4, 3, 4, 5);
        Figura r = new Rectangulo(6, 3);
        Figura c = new Circulo(2.5);

        Figura[] figuras = {t, r, c};

        for (Figura f : figuras) {
            System.out.println("Tipo: " + f.getClass().getSimpleName());
            System.out.println("Área: " + f.calcularArea());
            System.out.println("Perímetro: " + f.calcularPerimetro());
            System.out.println("-------------------");
        }
    }
}
