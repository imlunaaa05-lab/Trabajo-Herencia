class Persona {
    String nombre;
    String identificacion;
    int edad;
    String correo;

    public Persona(String nombre, String identificacion, int edad, String correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.correo = correo;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + identificacion);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
    }

    public void datosExtra() {}
}


class Estudiante extends Persona {
    String programa;
    int semestre;
    String codigo;

    public Estudiante(String nombre, String identificacion, int edad, String correo,
                      String programa, int semestre, String codigo) {
        super(nombre, identificacion, edad, correo);
        this.programa = programa;
        this.semestre = semestre;
        this.codigo = codigo;
    }

    public void datosExtra() {
        System.out.println("Programa: " + programa);
        System.out.println("Semestre: " + semestre);
        System.out.println("Código: " + codigo);
    }
}


class Docente extends Persona {
    String profesion;
    double salario;
    String materia;

    public Docente(String nombre, String identificacion, int edad, String correo,
                   String profesion, double salario, String materia) {
        super(nombre, identificacion, edad, correo);
        this.profesion = profesion;
        this.salario = salario;
        this.materia = materia;
    }

    public void datosExtra() {
        System.out.println("Profesión: " + profesion);
        System.out.println("Salario: " + salario);
        System.out.println("Materia: " + materia);
    }
}


class Administrativo extends Persona {
    String cargo;
    String departamento;
    double salario;

    public Administrativo(String nombre, String identificacion, int edad, String correo,
                          String cargo, String departamento, double salario) {
        super(nombre, identificacion, edad, correo);
        this.cargo = cargo;
        this.departamento = departamento;
        this.salario = salario;
    }

    public void datosExtra() {
        System.out.println("Cargo: " + cargo);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: " + salario);
    }
}


public class Main {
    public static void main(String[] args) {

        Persona estudiante = new Estudiante(
                "Ana Torres", "1001", 20, "ana@gmail.com",
                "Ingeniería de Sistemas", 4, "EST123"
        );

        Persona docente = new Docente(
                "Carlos Ruiz", "2002", 45, "carlos@gmail.com",
                "Ingeniero de sistemas", 3500000, "Programación"
        );

        Persona admin = new Administrativo(
                "Laura Gómez", "3003", 38, "laura@gmail.com",
                "Coordinadora", "Admisiones", 2800000
        );

        Persona[] personas = {estudiante, docente, admin};

        for (Persona p : personas) {
            System.out.println("Tipo: " + p.getClass().getSimpleName());
            p.mostrarInfo();
            p.datosExtra();
            System.out.println("-------------------");
        }
    }
}
