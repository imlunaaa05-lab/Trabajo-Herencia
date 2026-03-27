class Electrodomestico:
    def __init__(self, marca, consumo, color, estado):
        self.marca = marca
        self.consumo = consumo
        self.color = color
        self.estado = estado

    def mostrar_info(self):
        print("Marca:", self.marca)
        print("Consumo:", self.consumo, "W")
        print("Color:", self.color)
        print("Estado:", self.estado)

    def funcion(self):
        pass


class Nevera(Electrodomestico):
    def __init__(self, marca, consumo, color, estado, capacidad):
        super().__init__(marca, consumo, color, estado)
        self.capacidad = capacidad

    def funcion(self):
        print("Enfriando alimentos - Capacidad:", self.capacidad, "L")


class Lavadora(Electrodomestico):
    def __init__(self, marca, consumo, color, estado, carga):
        super().__init__(marca, consumo, color, estado)
        self.carga = carga

    def funcion(self):
        print("Lavando ropa - Carga:", self.carga, "kg")


class Microondas(Electrodomestico):
    def __init__(self, marca, consumo, color, estado, potencia):
        super().__init__(marca, consumo, color, estado)
        self.potencia = potencia

    def funcion(self):
        print("Calentando comida - Potencia:", self.potencia, "W")


e1 = Nevera("LG", 300, "Plateado", "Encendido", 400)
e2 = Lavadora("Samsung", 500, "Blanco", "Apagado", 12)
e3 = Microondas("Whirlpool", 1200, "Negro", "Encendido", 900)

lista = [e1, e2, e3]

for e in lista:
    print("Tipo:", type(e).__name__)
    e.mostrar_info()
    e.funcion()
    print("-------------------")
