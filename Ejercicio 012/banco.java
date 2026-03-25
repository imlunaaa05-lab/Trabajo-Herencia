class Cuenta {
    String numero;
    String titular;
    double saldo;
    String estado;

    public Cuenta(String numero, String titular, double saldo, String estado) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.estado = estado;
    }

    public void mostrarInfo() {
        System.out.println("Cuenta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Estado: " + estado);
    }

    public void operar() {}
}


class CuentaAhorros extends Cuenta {
    double interes = 0.02;

    public CuentaAhorros(String numero, String titular, double saldo, String estado) {
        super(numero, titular, saldo, estado);
    }

    public void operar() {
        double ganancia = saldo * interes;
        System.out.println("Interés generado: " + ganancia);
    }
}


class CuentaCorriente extends Cuenta {
    double limiteSobregiro = 500000;

    public CuentaCorriente(String numero, String titular, double saldo, String estado) {
        super(numero, titular, saldo, estado);
    }

    public void operar() {
        System.out.println("Tiene sobregiro disponible de: " + limiteSobregiro);
    }
}


class CuentaEstudiante extends Cuenta {

    public CuentaEstudiante(String numero, String titular, double saldo, String estado) {
        super(numero, titular, saldo, estado);
    }

    public void operar() {
        System.out.println("Cuenta sin comisiones");
    }
}


public class Main {
    public static void main(String[] args) {

        Cuenta c1 = new CuentaAhorros("001", "Ana", 1000000, "Activa");
        Cuenta c2 = new CuentaCorriente("002", "Carlos", 500000, "Activa");
        Cuenta c3 = new CuentaEstudiante("003", "Luis", 200000, "Activa");

        Cuenta[] cuentas = {c1, c2, c3};

        for (Cuenta c : cuentas) {
            System.out.println("Tipo: " + c.getClass().getSimpleName());
            c.mostrarInfo();
            c.operar();
            System.out.println("-------------------");
        }
    }
}
