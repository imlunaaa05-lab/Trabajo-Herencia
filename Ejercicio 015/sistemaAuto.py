class Vehiculo:
    def __init__(self,marca,modelo,velocidad):
        self.marca=marca
        self.modelo=modelo
        self.velocidad=velocidad

    def info(self):
        print(self.marca,self.modelo,"Velocidad:",self.velocidad)

    def funcionamiento(self):
        pass


class Carro(Vehiculo):
    def funcionamiento(self):
        print("Uso urbano familiar")


class Moto(Vehiculo):
    def funcionamiento(self):
        print("Vehículo de dos ruedas")


class Camion(Vehiculo):
    def funcionamiento(self):
        print("Transporte de carga pesada")



lista=[
    Carro("Toyota","Corolla",180),
    Moto("Yamaha","R15",150),
    Camion("Volvo","FH",120)
]

for v in lista:
    print("Tipo:",type(v).__name__)
    v.info()
    v.funcionamiento()
    print("-----")
