class Producto {

    protected String nombre;
    protected double precio;
    protected String codigo;
    protected String descripcion;

    public Producto(String nombre, double precio,
                    String codigo, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public void mostrarProducto() {
        System.out.println(nombre + " | $" + precio +
                " | Código: " + codigo);
    }
}

class ProductoElectronico extends Producto {

    private int garantiaMeses;

    public ProductoElectronico(String n,double p,String c,String d,int g) {
        super(n,p,c,d);
        garantiaMeses = g;
    }

    public void encender() {
        System.out.println(nombre + " encendido. Garantía: "
                + garantiaMeses + " meses");
    }
}

class ProductoRopa extends Producto {

    private String talla;

    public ProductoRopa(String n,double p,String c,String d,String talla) {
        super(n,p,c,d);
        this.talla = talla;
    }

    public void probar() {
        System.out.println("Probando " + nombre + " talla " + talla);
    }
}

class ProductoAlimento extends Producto {

    private String fechaVencimiento;

    public ProductoAlimento(String n,double p,String c,String d,String f) {
        super(n,p,c,d);
        fechaVencimiento = f;
    }

    public void verificar() {
        System.out.println(nombre + " vence en " + fechaVencimiento);
    }
}

public class Main {
    public static void main(String[] args) {

        ProductoElectronico tv =
                new ProductoElectronico("TV",2500,"E01","Smart TV",24);

        ProductoRopa camisa =
                new ProductoRopa("Camisa",80,"R02","Algodón","M");

        ProductoAlimento pan =
                new ProductoAlimento("Pan",5,"A03","Integral","10/04/2026");

        tv.mostrarProducto();
        tv.encender();

        camisa.mostrarProducto();
        camisa.probar();

        pan.mostrarProducto();
        pan.verificar();
    }
}
