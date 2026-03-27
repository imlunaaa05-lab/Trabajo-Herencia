
class PersonajeRPG:

    def __init__(self, nombre, vida, ataque, defensa, experiencia):
        self.nombre = nombre
        self.vida = vida
        self.ataque = ataque
        self.defensa = defensa
        self.experiencia = experiencia

    def mostrar_stats(self):
        print(f"{self.nombre} | Vida:{self.vida} Ataque:{self.ataque} Defensa:{self.defensa} EXP:{self.experiencia}")



class Guerrero(PersonajeRPG):

    def __init__(self, nombre):
        super().__init__(nombre,150,40,30,0)

    def ataque_pesado(self):
        print(f"{self.nombre} usa Ataque Pesado ")


class Mago(PersonajeRPG):

    def __init__(self, nombre):
        super().__init__(nombre,90,60,15,0)

    def lanzar_hechizo(self):
        print(f"{self.nombre} lanza un hechizo ")


class Arquero(PersonajeRPG):

    def __init__(self, nombre):
        super().__init__(nombre,110,35,20,0)

    def disparar(self):
        print(f"{self.nombre} dispara una flecha ")



g = Guerrero("Thorin")
m = Mago("Merlin")
a = Arquero("Legolas")

g.mostrar_stats()
g.ataque_pesado()

m.mostrar_stats()
m.lanzar_hechizo()

a.mostrar_stats()
a.disparar()
