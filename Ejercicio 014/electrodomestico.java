class Electrodomestico {
    String marca;
    int consumo;
    String color;
    String estado;

    public Electrodomestico(String marca, int consumo, String color, String estado) {
        this.marca = marca;
        this.consumo = consumo;
        this.color = color;
        this.estado = estado;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Consumo: " + consumo + "W");
        System.out.println("Color: " + color);
        System.out.println("Estado: " + estado);
    }

    public void funcion() {}
}

 
class Nevera extends Electrodomestico {
    int capacidad;

    public Nevera(String marca, int consumo, String color, String estado, int capacidad) {
        super(marca, consumo, color, estado);
        this.capacidad = capacidad;
    }

    public void funcion() {
        System.out.println("Enfriando alimentos - Capacidad: " + capacidad + "L");
    }
}


class Lavadora extends Electrodomestico {
    int carga;

    public Lavadora(String marca, int consumo, String color, String estado, int carga) {
        super(marca, consumo, color, estado);
        this.carga = carga;
    }

    public void funcion() {
        System.out.println("Lavando ropa - Carga: " + carga + "kg");
    }
}


class Microondas extends Electrodomestico {
    int potencia;

    public Microondas(String marca, int consumo, String color, String estado, int potencia) {
        super(marca, consumo, color, estado);
        this.potencia = potencia;
    }

    public void funcion() {
        System.out.println("Calentando comida - Potencia: " + potencia + "W");
    }
}

public class Main {
    public static void main(String[] args) {

        Electrodomestico e1 = new Nevera("LG", 300, "Plateado", "Encendido", 400);
        Electrodomestico e2 = new Lavadora("Samsung", 500, "Blanco", "Apagado", 12);
        Electrodomestico e3 = new Microondas("Whirlpool", 1200, "Negro", "Encendido", 900);

        Electrodomestico[] lista = {e1, e2, e3};

        for (Electrodomestico e : lista) {
            System.out.println("Tipo: " + e.getClass().getSimpleName());
            e.mostrarInfo();
            e.funcion();
            System.out.println("-------------------");
        }
    }
}
