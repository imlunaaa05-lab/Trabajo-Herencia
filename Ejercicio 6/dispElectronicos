class Dispositivo {
    String marca;
    String referencia;
    double consumo;
    String estado;

    public Dispositivo(String marca, String referencia, double consumo, String estado) {
        this.marca = marca;
        this.referencia = referencia;
        this.consumo = consumo;
        this.estado = estado;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Referencia: " + referencia);
        System.out.println("Consumo: " + consumo);
        System.out.println("Estado: " + estado);
    }

    public void funcion() {}
}


class Celular extends Dispositivo {
    public Celular(String marca, String referencia, double consumo, String estado) {
        super(marca, referencia, consumo, estado);
    }

    public void funcion() {
        System.out.println("Tiene cámara y es un objeto de bolsillo");
    }
}


class Laptop extends Dispositivo {
    public Laptop(String marca, String referencia, double consumo, String estado) {
        super(marca, referencia, consumo, estado);
    }

    public void funcion() {
        System.out.println("Tiene cámara y es de tamaño mediano");
    }
}


class Televisor extends Dispositivo {
    public Televisor(String marca, String referencia, double consumo, String estado) {
        super(marca, referencia, consumo, estado);
    }

    public void funcion() {
        System.out.println("No tiene cámara, pero tiene bocinas y es de tamaño grande");
    }
}


public class Main {
    public static void main(String[] args) {

        Dispositivo celular = new Celular("Samsung", "S21", 15, "Encendido");
        Dispositivo laptop = new Laptop("HP", "Pavilion", 65, "Apagado");
        Dispositivo tv = new Televisor("LG", "OLED", 120, "Encendido");

        Dispositivo[] dispositivos = {celular, laptop, tv};

        for (Dispositivo d : dispositivos) {
            System.out.println("Tipo: " + d.getClass().getSimpleName());
            d.mostrarInfo();
            d.funcion();
            System.out.println("-------------------");
        }
    }
}
