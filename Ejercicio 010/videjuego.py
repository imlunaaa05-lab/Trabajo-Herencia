class Personaje:
    def __init__(self, nombre, nivel, vida, energia):
        self.nombre = nombre
        self.nivel = nivel
        self.vida = vida
        self.energia = energia

    def mostrar_info(self):
        print("Nombre:", self.nombre)
        print("Nivel:", self.nivel)
        print("Vida:", self.vida)
        print("Energía:", self.energia)

    def atacar(self):
        pass


class Guerrero(Personaje):
    def atacar(self):
        print("Ataque: Realizar un ataque cuerpo a cuerpo con espada")


class Mago(Personaje):
    def atacar(self):
        print("Ataque: Lanzar un hechizo mágico a distancia")


class Arquero(Personaje):
    def atacar(self):
        print("Ataque: Disparar una flecha a distancia")



p1 = Guerrero("Thor", 10, 100, 50)
p2 = Mago("Merlin", 12, 80, 120)
p3 = Arquero("Legolas", 11, 90, 70)

personajes = [p1, p2, p3]

for p in personajes:
    print("Tipo:", type(p).__name__)
    p.mostrar_info()
    p.atacar()
    print("-------------------")
