class Libro {
    String titulo;
    String autor;
    String codigo;
    String fechaPublicacion;

    public Libro(String titulo, String autor, String codigo, String fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.fechaPublicacion = fechaPublicacion;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Código: " + codigo);
        System.out.println("Fecha: " + fechaPublicacion);
    }

    public void detalles() {}
}


class LibroFisico extends Libro {
    int paginas;
    String ubicacion;

    public LibroFisico(String titulo, String autor, String codigo, String fechaPublicacion,
                       int paginas, String ubicacion) {
        super(titulo, autor, codigo, fechaPublicacion);
        this.paginas = paginas;
        this.ubicacion = ubicacion;
    }

    public void detalles() {
        System.out.println("Páginas: " + paginas);
        System.out.println("Ubicación: " + ubicacion);
    }
}


class LibroDigital extends Libro {
    double tamañoMB;
    String formato;

    public LibroDigital(String titulo, String autor, String codigo, String fechaPublicacion,
                        double tamañoMB, String formato) {
        super(titulo, autor, codigo, fechaPublicacion);
        this.tamañoMB = tamañoMB;
        this.formato = formato;
    }

    public void detalles() {
        System.out.println("Tamaño: " + tamañoMB + " MB");
        System.out.println("Formato: " + formato);
    }
}


public class Main {
    public static void main(String[] args) {

        Libro l1 = new LibroFisico("Cien años de soledad", "García Márquez", "L001", "1967", 417, "Estante A");
        Libro l2 = new LibroDigital("Python Básico", "Juan Pérez", "L002", "2020", 5.6, "PDF");

        Libro[] libros = {l1, l2};

        for (Libro l : libros) {
            System.out.println("Tipo: " + l.getClass().getSimpleName());
            l.mostrarInfo();
            l.detalles();
            System.out.println("-------------------");
        }
    }
}
