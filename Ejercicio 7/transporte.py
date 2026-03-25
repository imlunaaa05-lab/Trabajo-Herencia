class Transporte:
    def __init__(self, combustible, capacidad, velocidad):
        self.combustible = combustible
        self.capacidad = capacidad
        self.velocidad = velocidad

    def mostrar_info(self):
        print("Combustible:", self.combustible)
        print("Capacidad:", self.capacidad)
        print("Velocidad:", self.velocidad)

    def mover(self):
        pass


class Terrestre(Transporte):
    def mover(self):
        print("Se desplaza por carretera")


class Aereo(Transporte):
    def mover(self):
        print("Vuela por el aire")


class Maritimo(Transporte):
    def mover(self):
        print("Navega en el agua")



t1 = Terrestre("Gasolina", 5, 120)
t2 = Aereo("Queroseno", 180, 800)
t3 = Maritimo("Diésel", 300, 60)

transportes = [t1, t2, t3]

for t in transportes:
    print("Tipo:", type(t).__name__)
    t.mostrar_info()
    t.mover()
    print("-------------------")
