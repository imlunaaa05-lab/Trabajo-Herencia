class Pago {
    double monto;
    String fecha;
    String estado;

    public Pago(double monto, String fecha, String estado) {
        this.monto = monto;
        this.fecha = fecha;
        this.estado = estado;
    }

    public void mostrarInfo() {
        System.out.println("Monto: " + monto);
        System.out.println("Fecha: " + fecha);
        System.out.println("Estado: " + estado);
    }

    public void procesarPago() {}
}


class Tarjeta extends Pago {
    String numero;
    String banco;

    public Tarjeta(double monto, String fecha, String estado, String numero, String banco) {
        super(monto, fecha, estado);
        this.numero = numero;
        this.banco = banco;
    }

    public void procesarPago() {
        System.out.println("Pago con tarjeta aprobado. Banco: " + banco);
    }
}


class Efectivo extends Pago {
    double entregado;

    public Efectivo(double monto, String fecha, String estado, double entregado) {
        super(monto, fecha, estado);
        this.entregado = entregado;
    }

    public void procesarPago() {
        double cambio = entregado - monto;
        System.out.println("Pago en efectivo. Cambio: " + cambio);
    }
}

class Transferencia extends Pago {
    String cuenta;
    String banco;

    public Transferencia(double monto, String fecha, String estado, String cuenta, String banco) {
        super(monto, fecha, estado);
        this.cuenta = cuenta;
        this.banco = banco;
    }

    public void procesarPago() {
        System.out.println("Transferencia realizada desde la cuenta: " + cuenta);
    }
}

public class Main {
    public static void main(String[] args) {

        Pago p1 = new Tarjeta(50000, "2026-03-25", "Aprobado", "1234-5678", "Bancolombia");
        Pago p2 = new Efectivo(30000, "2026-03-25", "Pendiente", 50000);
        Pago p3 = new Transferencia(70000, "2026-03-25", "Aprobado", "987654", "Davivienda");

        Pago[] pagos = {p1, p2, p3};

        for (Pago p : pagos) {
            System.out.println("Tipo: " + p.getClass().getSimpleName());
            p.mostrarInfo();
            p.procesarPago();
            System.out.println("-------------------");
        }
    }
}
