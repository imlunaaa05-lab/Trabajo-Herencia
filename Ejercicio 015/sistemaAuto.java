class Vehiculo {
    String marca;
    String modelo;
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
    public Carro(String m,String mo,int v){
        super(m,mo,v);
    }

    public void funcionamiento() {
        System.out.println("Vehículo familiar de uso urbano");
    }
}

class Moto extends Vehiculo {
    public Moto(String m,String mo,int v){
        super(m,mo,v);
    }

    public void funcionamiento() {
        System.out.println("Vehículo ágil de dos ruedas");
    }
}

class Camion extends Vehiculo {
    public Camion(String m,String mo,int v){
        super(m,mo,v);
    }

    public void funcionamiento() {
        System.out.println("Vehículo pesado de carga");
    }
}
