class Vehiculo:
    def __init__(self, placa, marca, modelo, velocidad, estado):
        self.placa = placa
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad
        self.estado = estado

    def mostrar_info(self):
        print("Placa:", self.placa)
        print("Marca:", self.marca)
        print("Modelo:", self.modelo)
        print("Velocidad:", self.velocidad)
        print("Estado:", self.estado)

    def caracteristicas(self):
        pass


class Carro(Vehiculo):
    def caracteristicas(self):
        print("Aceleración: Media")
        print("Llantas: 4")
        print("Puertas: 4")
        print("Pasajeros: 5")


class Moto(Vehiculo):
    def caracteristicas(self):
        print("Aceleración: Alta")
        print("Llantas: 2")
        print("Puertas: 0")
        print("Pasajeros: 2")


class Camion(Vehiculo):
    def caracteristicas(self):
        print("Aceleración: Baja")
        print("Llantas: 6")
        print("Puertas: 2")
        print("Pasajeros: 3")


class Bus(Vehiculo):
    def caracteristicas(self):
        print("Aceleración: Media")
        print("Llantas: 6")
        print("Puertas: 2")
        print("Pasajeros: 40")



carro = Carro("ABC123", "Toyota", "Corolla", 120, "Encendido")
moto = Moto("XYZ789", "Yamaha", "R15", 150, "Apagado")
camion = Camion("TRK456", "Volvo", "FH", 90, "Mantenimiento")
bus = Bus("BUS001", "Mercedes", "Sprinter", 100, "Encendido")

vehiculos = [carro, moto, camion, bus]

for v in vehiculos:
    print("Tipo de vehículo:", type(v).__name__)
    v.mostrar_info()
    v.caracteristicas()
    print("-------------------")
