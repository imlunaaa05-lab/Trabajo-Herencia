class Vehiculo {
    String marca, modelo;
    int velocidad;

    public Vehiculo(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public void info() {
        System.out.println(marca + " " + modelo +
                " Velocidad: " + velocidad);
    }

    public void funcionamiento() {}
}

class Carro extends Vehiculo {
    public Carro(String m,String mo,int v){ super(m,mo,v); }

    public void funcionamiento() {
        System.out.println("Uso urbano familiar");
    }
}

class Moto extends Vehiculo {
    public Moto(String m,String mo,int v){ super(m,mo,v); }

    public void funcionamiento() {
        System.out.println("Vehículo de dos ruedas");
    }
}

class Camion extends Vehiculo {
    public Camion(String m,String mo,int v){ super(m,mo,v); }

    public void funcionamiento() {
        System.out.println("Transporte de carga pesada");
    }
}

public class Main {
    public static void main(String[] args) {

        Vehiculo[] lista = {
            new Carro("Toyota","Corolla",180),
            new Moto("Yamaha","R15",150),
            new Camion("Volvo","FH",120)
        };

        for(Vehiculo v : lista){
            System.out.println("Tipo: "+v.getClass().getSimpleName());
            v.info();
            v.funcionamiento();
            System.out.println("-----");
        }
    }
}
