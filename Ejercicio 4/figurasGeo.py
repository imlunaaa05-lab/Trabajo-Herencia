import math

class Figura:
    def calcular_area(self):
        return 0

    def calcular_perimetro(self):
        return 0


class Triangulo(Figura):
    def __init__(self, base, altura, lado1, lado2, lado3):
        self.base = base
        self.altura = altura
        self.lado1 = lado1
        self.lado2 = lado2
        self.lado3 = lado3

    def calcular_area(self):
        return (self.base * self.altura) / 2

    def calcular_perimetro(self):
        return self.lado1 + self.lado2 + self.lado3


class Rectangulo(Figura):
    def __init__(self, ancho, alto):
        self.ancho = ancho
        self.alto = alto

    def calcular_area(self):
        return self.ancho * self.alto

    def calcular_perimetro(self):
        return 2 * (self.ancho + self.alto)


class Circulo(Figura):
    def __init__(self, radio):
        self.radio = radio

    def calcular_area(self):
        return math.pi * self.radio ** 2

    def calcular_perimetro(self):
        return 2 * math.pi * self.radio


t = Triangulo(5, 4, 3, 4, 5)
r = Rectangulo(6, 3)
c = Circulo(2.5)

figuras = [t, r, c]

for f in figuras:
    print("Tipo:", type(f).__name__)
    print("Área:", f.calcular_area())
    print("Perímetro:", f.calcular_perimetro())
    print("-------------------")
