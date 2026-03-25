class Animal {
    String nombre;
    String tipo;
    int edad;

    public Animal(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Edad: " + edad);
    }

    public void moverse() {}
}


class Terrestre extends Animal {
    public Terrestre(String nombre, String tipo, int edad) {
        super(nombre, tipo, edad);
    }

    public void moverse() {
        System.out.println("Se desplaza caminando");
    }
}


class Aereo extends Animal {
    public Aereo(String nombre, String tipo, int edad) {
        super(nombre, tipo, edad);
    }

    public void moverse() {
        System.out.println("Vuela");
    }
}


class Acuatico extends Animal {
    public Acuatico(String nombre, String tipo, int edad) {
        super(nombre, tipo, edad);
    }

    public void moverse() {
        System.out.println("Nada");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Terrestre("León", "Mamífero", 5);
        Animal a2 = new Aereo("Águila", "Ave", 3);
        Animal a3 = new Acuatico("Tiburón", "Pez", 8);

        Animal[] animales = {a1, a2, a3};

        for (Animal a : animales) {
            System.out.println("Tipo: " + a.getClass().getSimpleName());
            a.mostrarInfo();
            a.moverse();
            System.out.println("-------------------");
        }
    }
}
