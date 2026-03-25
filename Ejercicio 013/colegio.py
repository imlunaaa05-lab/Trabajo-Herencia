class Persona:
    def __init__(self, nombre, id, edad):
        self.nombre = nombre
        self.id = id
        self.edad = edad

    def mostrar_info(self):
        print("Nombre:", self.nombre)
        print("ID:", self.id)
        print("Edad:", self.edad)

    def rol(self):
        pass


class Estudiante(Persona):
    def __init__(self, nombre, id, edad, grado, promedio):
        super().__init__(nombre, id, edad)
        self.grado = grado
        self.promedio = promedio

    def rol(self):
        print("Grado:", self.grado)
        print("Promedio:", self.promedio)


class Profesor(Persona):
    def __init__(self, nombre, id, edad, materia, salario):
        super().__init__(nombre, id, edad)
        self.materia = materia
        self.salario = salario

    def rol(self):
        print("Materia:", self.materia)
        print("Salario:", self.salario)


class Directivo(Persona):
    def __init__(self, nombre, id, edad, cargo, experiencia):
        super().__init__(nombre, id, edad)
        self.cargo = cargo
        self.experiencia = experiencia

    def rol(self):
        print("Cargo:", self.cargo)
        print("Años de experiencia:", self.experiencia)


# MAIN
p1 = Estudiante("Sofia", "101", 16, "11°", 4.5)
p2 = Profesor("Carlos", "202", 40, "Matemáticas", 2500000)
p3 = Directivo("Marta", "303", 50, "Rectora", 20)

personas = [p1, p2, p3]

for p in personas:
    print("Persona:", type(p).__name__)
    p.mostrar_info()
    p.rol()
    print("-------------------")
