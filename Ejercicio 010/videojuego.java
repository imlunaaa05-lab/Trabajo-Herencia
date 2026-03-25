class Personaje {
    String nombre;
    int nivel;
    int vida;
    int energia;

    public Personaje(String nombre, int nivel, int vida, int energia) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.energia = energia;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Energía: " + energia);
    }

    public void atacar() {}
}


class Guerrero extends Personaje {
    public Guerrero(String nombre, int nivel, int vida, int energia) {
        super(nombre, nivel, vida, energia);
    }

    public void atacar() {
        System.out.println("Ataque: Realizar un ataque cuerpo a cuerpo con espada");
    }
}


class Mago extends Personaje {
    public Mago(String nombre, int nivel, int vida, int energia) {
        super(nombre, nivel, vida, energia);
    }

    public void atacar() {
        System.out.println("Ataque: Lanzar un hechizo mágico a distancia");
    }
}


class Arquero extends Personaje {
    public Arquero(String nombre, int nivel, int vida, int energia) {
        super(nombre, nivel, vida, energia);
    }

    public void atacar() {
        System.out.println("Ataque: Disparar una flecha a distancia");
    }
}


public class Main {
    public static void main(String[] args) {

        Personaje p1 = new Guerrero("Thor", 10, 100, 50);
        Personaje p2 = new Mago("Merlin", 12, 80, 120);
        Personaje p3 = new Arquero("Legolas", 11, 90, 70);

        Personaje[] personajes = {p1, p2, p3};

        for (Personaje p : personajes) {
            System.out.println("Tipo: " + p.getClass().getSimpleName());
            p.mostrarInfo();
            p.atacar();
            System.out.println("-------------------");
        }
    }
}
