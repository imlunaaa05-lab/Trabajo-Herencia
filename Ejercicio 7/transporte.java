class Transporte {
    String combustible;
    int capacidad;
    double velocidad;

    public Transporte(String combustible, int capacidad, double velocidad) {
        this.combustible = combustible;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    public void mostrarInfo() {
        System.out.println("Combustible: " + combustible);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Velocidad: " + velocidad);
    }

    public void mover() {}
}


class Terrestre extends Transporte {
    public Terrestre(String combustible, int capacidad, double velocidad) {
        super(combustible, capacidad, velocidad);
    }

    public void mover() {
        System.out.println("Se desplaza por carretera");
    }
}


class Aereo extends Transporte {
    public Aereo(String combustible, int capacidad, double velocidad) {
        super(combustible, capacidad, velocidad);
    }

    public void mover() {
        System.out.println("Vuela por el aire");
    }
}


class Maritimo extends Transporte {
    public Maritimo(String combustible, int capacidad, double velocidad) {
        super(combustible, capacidad, velocidad);
    }

    public void mover() {
        System.out.println("Navega en el agua");
    }
}


public class Main {
    public static void main(String[] args) {

        Transporte t1 = new Terrestre("Gasolina", 5, 120);
        Transporte t2 = new Aereo("Queroseno", 180, 800);
        Transporte t3 = new Maritimo("Diésel", 300, 60);

        Transporte[] transportes = {t1, t2, t3};

        for (Transporte t : transportes) {
            System.out.println("Tipo: " + t.getClass().getSimpleName());
            t.mostrarInfo();
            t.mover();
            System.out.println("-------------------");
        }
    }
}
