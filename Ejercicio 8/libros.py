class Libro:
    def __init__(self, titulo, autor, codigo, fecha):
        self.titulo = titulo
        self.autor = autor
        self.codigo = codigo
        self.fecha = fecha

    def mostrar_info(self):
        print("Título:", self.titulo)
        print("Autor:", self.autor)
        print("Código:", self.codigo)
        print("Fecha:", self.fecha)

    def detalles(self):
        pass


class LibroFisico(Libro):
    def __init__(self, titulo, autor, codigo, fecha, paginas, ubicacion):
        super().__init__(titulo, autor, codigo, fecha)
        self.paginas = paginas
        self.ubicacion = ubicacion

    def detalles(self):
        print("Páginas:", self.paginas)
        print("Ubicación:", self.ubicacion)


class LibroDigital(Libro):
    def __init__(self, titulo, autor, codigo, fecha, tamaño, formato):
        super().__init__(titulo, autor, codigo, fecha)
        self.tamaño = tamaño
        self.formato = formato

    def detalles(self):
        print("Tamaño:", self.tamaño, "MB")
        print("Formato:", self.formato)



l1 = LibroFisico("Cien años de soledad", "García Márquez", "L001", "1967", 417, "Estante A")
l2 = LibroDigital("Python Básico", "Juan Pérez", "L002", "2020", 5.6, "PDF")

libros = [l1, l2]

for l in libros:
    print("Tipo:", type(l).__name__)
    l.mostrar_info()
    l.detalles()
    print("-------------------")
