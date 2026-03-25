class Empleado {
    String nombre;
    String documento;
    double salarioBase;
    String fechaIngreso;

    public Empleado(String nombre, String documento, double salarioBase, String fechaIngreso) {
        this.nombre = nombre;
        this.documento = documento;
        this.salarioBase = salarioBase;
        this.fechaIngreso = fechaIngreso;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }

    public double calcularSalario() {
        return salarioBase;
    }
}


class Gerente extends Empleado {
    double bono;

    public Gerente(String nombre, String documento, double salarioBase, String fechaIngreso, double bono) {
        super(nombre, documento, salarioBase, fechaIngreso);
        this.bono = bono;
    }

    public double calcularSalario() {
        return salarioBase + bono;
    }
}


class Operario extends Empleado {
    int horas;
    double pagoHora;

    public Operario(String nombre, String documento, double salarioBase, String fechaIngreso,
                    int horas, double pagoHora) {
        super(nombre, documento, salarioBase, fechaIngreso);
        this.horas = horas;
        this.pagoHora = pagoHora;
    }

    public double calcularSalario() {
        return horas * pagoHora;
    }
}


class Desarrollador extends Empleado {
    String lenguaje;

    public Desarrollador(String nombre, String documento, double salarioBase, String fechaIngreso,
                         String lenguaje) {
        super(nombre, documento, salarioBase, fechaIngreso);
        this.lenguaje = lenguaje;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}


public class Main {
    public static void main(String[] args) {

        Empleado gerente = new Gerente("Laura", "1001", 3000000, "2020", 1000000);
        Empleado operario = new Operario("Pedro", "2002", 0, "2022", 160, 10000);
        Empleado dev = new Desarrollador("Andres", "3003", 4000000, "2021", "Java");

        Empleado[] empleados = {gerente, operario, dev};

        for (Empleado e : empleados) {
            System.out.println("Tipo: " + e.getClass().getSimpleName());
            e.mostrarInfo();
            System.out.println("Salario total: " + e.calcularSalario());
            System.out.println("-------------------");
        }
    }
}
