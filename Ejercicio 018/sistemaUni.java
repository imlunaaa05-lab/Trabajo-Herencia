class Persona {

    protected String identificacion;
    protected String nombre;
    protected String contacto;

    public Persona(String id, String nombre, String contacto) {
        this.identificacion = id;
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public void mostrarDatos() {
        System.out.println(nombre + " | ID: " + identificacion +
                " | Contacto: " + contacto);
    }
}



class Estudiante extends Persona {

    private String programa;
    private int semestre;

    public Estudiante(String id, String nombre, String contacto,
                      String programa, int semestre) {
        super(id, nombre, contacto);
        this.programa = programa;
        this.semestre = semestre;
    }

    public void estudiar() {
        System.out.println(nombre + " estudia " + programa +
                " semestre " + semestre);
    }
}

class Docente extends Persona {

    private String area;
    private String materia;

    public Docente(String id, String nombre, String contacto,
                   String area, String materia) {
        super(id, nombre, contacto);
        this.area = area;
        this.materia = materia;
    }

    public void enseñar() {
        System.out.println(nombre + " dicta " + materia +
                " en el área " + area);
    }
}

class Administrativo extends Persona {

    private String cargo;

    public Administrativo(String id, String nombre, String contacto,
                          String cargo) {
        super(id, nombre, contacto);
        this.cargo = cargo;
    }

    public void gestionar() {
        System.out.println(nombre + " trabaja como " + cargo);
    }
}

public class Main {
    public static void main(String[] args) {

        Estudiante e = new Estudiante("101","Ana","ana@uni.edu","Ingeniería",5);
        Docente d = new Docente("202","Carlos","carlos@uni.edu","Sistemas","POO");
        Administrativo a = new Administrativo("303","Laura","laura@uni.edu","Secretaria");

        e.mostrarDatos();
        e.estudiar();

        d.mostrarDatos();
        d.enseñar();

        a.mostrarDatos();
        a.gestionar();
    }
}
