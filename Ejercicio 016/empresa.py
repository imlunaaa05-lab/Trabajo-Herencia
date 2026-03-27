class Empleado:
    def __init__(self,nombre,id):
        self.nombre=nombre
        self.id=id

    def rol(self):
        pass


class Desarrollador(Empleado):
    def rol(self):
        print("Desarrolla software")


class Tester(Empleado):
    def rol(self):
        print("Prueba aplicaciones")


class ProjectManager(Empleado):
    def rol(self):
        print("Gestiona proyectos")



lista=[
    Desarrollador("Ana","01"),
    Tester("Luis","02"),
    ProjectManager("Carlos","03")
]

for e in lista:
    print(type(e).__name__)
    e.rol()
    print("-----")
