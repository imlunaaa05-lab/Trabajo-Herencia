class Persona:
    def __init__(self, nombre, identificacion, edad, correo):
        self.nombre = nombre
        self.identificacion = identificacion
        self.edad = edad
        self.correo = correo

    def mostrar_info(self):
        print("Nombre:", self.nombre)
        print("ID:", self.identificacion)
        print("Edad:", self.edad)
        print("Correo:", self.correo)

    def datos_extra(self):
        pass


class Estudiante(Persona):
    def __init__(self, nombre, identificacion, edad, correo, programa, semestre, codigo):
        super().__init__(nombre, identificacion, edad, correo)
        self.programa = programa
        self.semestre = semestre
        self.codigo = codigo

    def datos_extra(self):
        print("Programa:", self.programa)
        print("Semestre:", self.semestre)
        print("Código:", self.codigo)


class Docente(Persona):
    def __init__(self, nombre, identificacion, edad, correo, profesion, salario, materia):
        super().__init__(nombre, identificacion, edad, correo)
        self.profesion = profesion
        self.salario = salario
        self.materia = materia

    def datos_extra(self):
        print("Profesión:", self.profesion)
        print("Salario:", self.salario)
        print("Materia:", self.materia)


class Administrativo(Persona):
    def __init__(self, nombre, identificacion, edad, correo, cargo, departamento, salario):
        super().__init__(nombre, identificacion, edad, correo)
        self.cargo = cargo
        self.departamento = departamento
        self.salario = salario

    def datos_extra(self):
        print("Cargo:", self.cargo)
        print("Departamento:", self.departamento)
        print("Salario:", self.salario)



estudiante = Estudiante(
    "Ana Torres", "1001", 20, "ana@gmail.com",
    "Ingeniería de Sistemas", 4, "EST123"
)

docente = Docente(
    "Carlos Ruiz", "2002", 45, "carlos@gmail.com",
    "Ingeniero de sistemas", 3500000, "Programación"
)

admin = Administrativo(
    "Laura Gómez", "3003", 38, "laura@gmail.com",
    "Coordinadora", "Admisiones", 2800000
)

personas = [estudiante, docente, admin]

for p in personas:
    print("Tipo:", type(p).__name__)
    p.mostrar_info()
    p.datos_extra()
    print("-------------------")
