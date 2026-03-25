class Animal:
    def __init__(self, nombre, tipo, edad):
        self.nombre = nombre
        self.tipo = tipo
        self.edad = edad

    def mostrar_info(self):
        print("Nombre:", self.nombre)
        print("Tipo:", self.tipo)
        print("Edad:", self.edad)

    def moverse(self):
        pass


class Terrestre(Animal):
    def moverse(self):
        print("Se desplaza caminando")


class Aereo(Animal):
    def moverse(self):
        print("Vuela")


class Acuatico(Animal):
    def moverse(self):
        print("Nada")


a1 = Terrestre("León", "Mamífero", 5)
a2 = Aereo("Águila", "Ave", 3)
a3 = Acuatico("Tiburón", "Pez", 8)

animales = [a1, a2, a3]

for a in animales:
    print("Tipo:", type(a).__name__)
    a.mostrar_info()
    a.moverse()
    print("-------------------")
