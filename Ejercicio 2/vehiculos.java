class Vehiculo {
    String placa;
    String marca;
    String modelo;
    double velocidad;
    String estado;

    public Vehiculo(String placa, String marca, String modelo, double velocidad, String estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.estado = estado;
    }

    public void mostrarInfo() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Estado: " + estado);
    }

    public void caracteristicas() {}
}


class Carro extends Vehiculo {
    String tipoAceleracion = "Media";
    int llantas = 4;
    int puertas = 4;
    int pasajeros = 5;

    public Carro(String placa, String marca, String modelo, double velocidad, String estado) {
        super(placa, marca, modelo, velocidad, estado);
    }

    public void caracteristicas() {
        System.out.println("Aceleración: " + tipoAceleracion);
        System.out.println("Llantas: " + llantas);
        System.out.println("Puertas: " + puertas);
        System.out.println("Pasajeros: " + pasajeros);
    }
}


class Moto extends Vehiculo {
    String tipoAceleracion = "Alta";
    int llantas = 2;
    int puertas = 0;
    int pasajeros = 2;

    public Moto(String placa, String marca, String modelo, double velocidad, String estado) {
        super(placa, marca, modelo, velocidad, estado);
    }

    public void caracteristicas() {
        System.out.println("Aceleración: " + tipoAceleracion);
        System.out.println("Llantas: " + llantas);
        System.out.println("Puertas: " + puertas);
        System.out.println("Pasajeros: " + pasajeros);
    }
}


class Camion extends Vehiculo {
    String tipoAceleracion = "Baja";
    int llantas = 6;
    int puertas = 2;
    int pasajeros = 3;

    public Camion(String placa, String marca, String modelo, double velocidad, String estado) {
        super(placa, marca, modelo, velocidad, estado);
    }

    public void caracteristicas() {
        System.out.println("Aceleración: " + tipoAceleracion);
        System.out.println("Llantas: " + llantas);
        System.out.println("Puertas: " + puertas);
        System.out.println("Pasajeros: " + pasajeros);
    }
}


class Bus extends Vehiculo {
    String tipoAceleracion = "Media";
    int llantas = 6;
    int puertas = 2;
    int pasajeros = 40;

    public Bus(String placa, String marca, String modelo, double velocidad, String estado) {
        super(placa, marca, modelo, velocidad, estado);
    }

    public void caracteristicas() {
        System.out.println("Aceleración: " + tipoAceleracion);
        System.out.println("Llantas: " + llantas);
        System.out.println("Puertas: " + puertas);
        System.out.println("Pasajeros: " + pasajeros);
    }
}


public class Main {
    public static void main(String[] args) {

        Vehiculo carro = new Carro("ABC123", "Toyota", "Corolla", 120, "Encendido");
        Vehiculo moto = new Moto("XYZ789", "Yamaha", "R15", 150, "Apagado");
        Vehiculo camion = new Camion("TRK456", "Volvo", "FH", 90, "Mantenimiento");
        Vehiculo bus = new Bus("BUS001", "Mercedes", "Sprinter", 100, "Encendido");

        Vehiculo[] vehiculos = {carro, moto, camion, bus};

        for (Vehiculo v : vehiculos) {
      System.out.println("Tipo de vehículo: " + v.getClass().getSimpleName());
     v.mostrarInfo();
     v.caracteristicas();
     System.out.println("-------------------");

        }
    }
}
