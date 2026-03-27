
class Persona:

    def __init__(self, identificacion, nombre, contacto):
        self.identificacion = identificacion
        self.nombre = nombre
        self.contacto = contacto

    def mostrar_datos(self):
        print(f"{self.nombre} | ID: {self.identificacion} | Contacto: {self.contacto}")



class Estudiante(Persona):

    def __init__(self, id, nombre, contacto, programa, semestre):
        super().__init__(id, nombre, contacto)
        self.programa = programa
        self.semestre = semestre

    def estudiar(self):
        print(f"{self.nombre} estudia {self.programa} semestre {self.semestre}")


class Docente(Persona):

    def __init__(self, id, nombre, contacto, area, materia):
        super().__init__(id, nombre, contacto)
        self.area = area
        self.materia = materia

    def ensenar(self):
        print(f"{self.nombre} dicta {self.materia} en {self.area}")


class Administrativo(Persona):

    def __init__(self, id, nombre, contacto, cargo):
        super().__init__(id, nombre, contacto)
        self.cargo = cargo

    def gestionar(self):
        print(f"{self.nombre} trabaja como {self.cargo}")


e = Estudiante("101","Ana","ana@uni.edu","Ingeniería",5)
d = Docente("202","Carlos","carlos@uni.edu","Sistemas","POO")
a = Administrativo("303","Laura","laura@uni.edu","Secretaria")

e.mostrar_datos()
e.estudiar()

d.mostrar_datos()
d.ensenar()

a.mostrar_datos()
a.gestionar()
