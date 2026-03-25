class Animal {
    String nombre;
    int edad;
    double peso;
    String habitat;

    public Animal(String nombre, int edad, double peso, String habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.habitat = habitat;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Habitat: " + habitat);
    }

    public void hacerSonido() {}
    public void moverse() {}
}


class Leon extends Animal {
    public Leon(String nombre, int edad, double peso, String habitat) {
        super(nombre, edad, peso, habitat);
    }

    public void hacerSonido() {
        System.out.println("Hace: Grrr");
    }

    public void moverse() {
        System.out.println("Camina en 4 patas");
    }
}


class Serpiente extends Animal {
    public Serpiente(String nombre, int edad, double peso, String habitat) {
        super(nombre, edad, peso, habitat);
    }

    public void hacerSonido() {
        System.out.println("Hace: Ssss");
    }

    public void moverse() {
        System.out.println("Se arrastra");
    }
}


class Pajaro extends Animal {
    public Pajaro(String nombre, int edad, double peso, String habitat) {
        super(nombre, edad, peso, habitat);
    }

    public void hacerSonido() {
        System.out.println("Hace: Cucu");
    }

    public void moverse() {
        System.out.println("Camina en 2 patas");
    }
}


class Pato extends Animal {
    public Pato(String nombre, int edad, double peso, String habitat) {
        super(nombre, edad, peso, habitat);
    }

    public void hacerSonido() {
        System.out.println("Hace: Quack");
    }

    public void moverse() {
        System.out.println("Camina en 2 patas");
    }
}


public class Main {
    public static void main(String[] args) {

        Leon leon = new Leon("Pepito", 5, 190.5, "Sabana");
        Serpiente serpiente = new Serpiente("Luna", 2, 12.3, "Selva");
        Pajaro pajaro = new Pajaro("Pajaro Loco", 1, 0.5, "Bosque");
        Pato pato = new Pato("Donald", 3, 3.2, "Lago");

        Animal[] animales = {leon, serpiente, pajaro, pato};

        for (Animal a : animales) {
            a.mostrarInfo();
            a.hacerSonido();
            a.moverse();
            System.out.println("-------------------");
        }
    }
}
