
class Animal:
    def __init__(self, nombre, edad, peso, habitat):
        self.nombre = nombre
        self.edad = edad
        self.peso = peso
        self.habitat = habitat

    def mostrar_info(self):
        print("Nombre:", self.nombre)
        print("Edad:", self.edad)
        print("Peso:", self.peso)
        print("Habitat:", self.habitat)

    def hacer_sonido(self):
        pass

    def moverse(self):
        pass


class Leon(Animal):
    def hacer_sonido(self):
        print("Hace: Grrr")

    def moverse(self):
        print("Camina en 4 patas")


class Serpiente(Animal):
    def hacer_sonido(self):
        print("Hace: Ssss")

    def moverse(self):
        print("Se arrastra")


class Pajaro(Animal):
    def hacer_sonido(self):
        print("Hace: Cucu")

    def moverse(self):
        print("Camina en 2 patas")


class Pato(Animal):
    def hacer_sonido(self):
        print("Hace: Quack")

    def moverse(self):
        print("Camina en 2 patas")



leon = Leon("Pepito", 5, 190.5, "Sabana")
serpiente = Serpiente("Luna", 2, 12.3, "Selva")
pajaro = Pajaro("Pajaro Loco", 1, 0.5, "Bosque")
pato = Pato("Donald", 3, 3.2, "Lago")

animales = [leon, serpiente, pajaro, pato]

for a in animales:
    a.mostrar_info()
    a.hacer_sonido()
    a.moverse()
    print("-------------------")
