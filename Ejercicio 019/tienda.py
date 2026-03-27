
class Producto:

    def __init__(self, nombre, precio, codigo, descripcion):
        self.nombre = nombre
        self.precio = precio
        self.codigo = codigo
        self.descripcion = descripcion

    def mostrar_producto(self):
        print(f"{self.nombre} | ${self.precio} | Código: {self.codigo}")


class ProductoElectronico(Producto):

    def __init__(self, n, p, c, d, garantia):
        super().__init__(n,p,c,d)
        self.garantia = garantia

    def encender(self):
        print(f"{self.nombre} encendido. Garantía {self.garantia} meses")


class ProductoRopa(Producto):

    def __init__(self, n, p, c, d, talla):
        super().__init__(n,p,c,d)
        self.talla = talla

    def probar(self):
        print(f"Probando {self.nombre} talla {self.talla}")


class ProductoAlimento(Producto):

    def __init__(self, n, p, c, d, fecha):
        super().__init__(n,p,c,d)
        self.fecha = fecha

    def verificar(self):
        print(f"{self.nombre} vence en {self.fecha}")



tv = ProductoElectronico("TV",2500,"E01","Smart TV",24)
camisa = ProductoRopa("Camisa",80,"R02","Algodón","M")
pan = ProductoAlimento("Pan",5,"A03","Integral","10/04/2026")

tv.mostrar_producto()
tv.encender()

camisa.mostrar_producto()
camisa.probar()

pan.mostrar_producto()
pan.verificar()
