
class FiguraGeometrica:

    def __init__(self, nombre, lados, angulos):
        self.nombre = nombre
        self.lados = lados
        self.angulos = angulos

    def mostrar_info(self):
        print("Figura:", self.nombre)
        print("Lados:", self.lados)
        print("Ángulos:", self.angulos)



class Triangulo(FiguraGeometrica):

    def __init__(self, base, altura):
        super().__init__("Triangulo", 3, 3)
        self.base = base
        self.altura = altura

    def calcular_area(self):
        return (self.base * self.altura) / 2



class Cuadrado(FiguraGeometrica):

    def __init__(self, lado):
        super().__init__("Cuadrado", 4, 4)
        self.lado = lado

    def calcular_area(self):
        return self.lado ** 2


class Circulo(FiguraGeometrica):

    def __init__(self, radio):
        super().__init__("Circulo", 0, 0)
        self.radio = radio

    def calcular_area(self):
        import math
        return math.pi * self.radio ** 2



t = Triangulo(6,4)
c = Cuadrado(5)
ci = Circulo(3)

t.mostrar_info()
print("Área:", t.calcular_area())
print()

c.mostrar_info()
print("Área:", c.calcular_area())
print()

ci.mostrar_info()
print("Área:", ci.calcular_area())
