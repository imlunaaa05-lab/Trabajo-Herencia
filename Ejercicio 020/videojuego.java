class PersonajeRPG {

    protected String nombre;
    protected int vida;
    protected int ataque;
    protected int defensa;
    protected int experiencia;

    public PersonajeRPG(String n,int v,int a,int d,int e) {
        nombre = n;
        vida = v;
        ataque = a;
        defensa = d;
        experiencia = e;
    }

    public void mostrarStats() {
        System.out.println(nombre +
                " | Vida:" + vida +
                " Ataque:" + ataque +
                " Defensa:" + defensa +
                " EXP:" + experiencia);
    }
}

class Guerrero extends PersonajeRPG {

    public Guerrero(String n) {
        super(n,150,40,30,0);
    }

    public void ataquePesado() {
        System.out.println(nombre + " usa Ataque Pesado ");
    }
}

class Mago extends PersonajeRPG {

    public Mago(String n) {
        super(n,90,60,15,0);
    }

    public void lanzarHechizo() {
        System.out.println(nombre + " lanza un hechizo ");
    }
}

class Arquero extends PersonajeRPG {

    public Arquero(String n) {
        super(n,110,35,20,0);
    }

    public void disparar() {
        System.out.println(nombre + " dispara una flecha ");
    }
}

public class Main {
    public static void main(String[] args) {

        Guerrero g = new Guerrero("Thorin");
        Mago m = new Mago("Merlin");
        Arquero a = new Arquero("Legolas");

        g.mostrarStats();
        g.ataquePesado();

        m.mostrarStats();
        m.lanzarHechizo();

        a.mostrarStats();
        a.disparar();
    }
}
