class Persona {
    String nombre;
    String id;
    int edad;

    public Persona(String nombre, String id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Edad: " + edad);
    }

    public void rol() {}
}


class Estudiante extends Persona {
    String grado;
    double promedio;

    public Estudiante(String nombre, String id, int edad, String grado, double promedio) {
        super(nombre, id, edad);
        this.grado = grado;
        this.promedio = promedio;
    }

    public void rol() {
        System.out.println("Grado: " + grado);
        System.out.println("Promedio: " + promedio);
    }
}


class Profesor extends Persona {
    String materia;
    double salario;

    public Profesor(String nombre, String id, int edad, String materia, double salario) {
        super(nombre, id, edad);
        this.materia = materia;
        this.salario = salario;
    }

    public void rol() {
        System.out.println("Materia: " + materia);
        System.out.println("Salario: " + salario);
    }
}


class Directivo extends Persona {
    String cargo;
    int experiencia;

    public Directivo(String nombre, String id, int edad, String cargo, int experiencia) {
        super(nombre, id, edad);
        this.cargo = cargo;
        this.experiencia = experiencia;
    }

    public void rol() {
        System.out.println("Cargo: " + cargo);
        System.out.println("Años de experiencia: " + experiencia);
    }
}


public class Main {
    public static void main(String[] args) {

        Persona p1 = new Estudiante("Sofia", "101", 16, "11°", 4.5);
        Persona p2 = new Profesor("Carlos", "202", 40, "Matemáticas", 2500000);
        Persona p3 = new Directivo("Marta", "303", 50, "Rectora", 20);

        Persona[] personas = {p1, p2, p3};

        for (Persona p : personas) {
            System.out.println("Persona: " + p.getClass().getSimpleName());
            p.mostrarInfo();
            p.rol();
            System.out.println("-------------------");
        }
    }
}
