class Vehiculo:
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def info(self):
        print(self.marca, self.modelo,
              "Velocidad:", self.velocidad)

    def funcionamiento(self):
        pass


class Carro(Vehiculo):
    def funcionamiento(self):
        print("Vehículo familiar de uso urbano")


class Moto(Vehiculo):
    def funcionamiento(self):
        print("Vehículo ágil de dos ruedas")


class Camion(Vehiculo):
    def funcionamiento(self):
        print("Vehículo pesado de carga")
