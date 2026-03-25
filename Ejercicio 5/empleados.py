class Empleado:
    def __init__(self, nombre, documento, salario_base, fecha_ingreso):
        self.nombre = nombre
        self.documento = documento
        self.salario_base = salario_base
        self.fecha_ingreso = fecha_ingreso

    def mostrar_info(self):
        print("Nombre:", self.nombre)
        print("Documento:", self.documento)
        print("Salario Base:", self.salario_base)
        print("Fecha ingreso:", self.fecha_ingreso)

    def calcular_salario(self):
        return self.salario_base


class Gerente(Empleado):
    def __init__(self, nombre, documento, salario_base, fecha_ingreso, bono):
        super().__init__(nombre, documento, salario_base, fecha_ingreso)
        self.bono = bono

    def calcular_salario(self):
        return self.salario_base + self.bono


class Operario(Empleado):
    def __init__(self, nombre, documento, salario_base, fecha_ingreso, horas, pago_hora):
        super().__init__(nombre, documento, salario_base, fecha_ingreso)
        self.horas = horas
        self.pago_hora = pago_hora

    def calcular_salario(self):
        return self.horas * self.pago_hora


class Desarrollador(Empleado):
    def __init__(self, nombre, documento, salario_base, fecha_ingreso, lenguaje):
        super().__init__(nombre, documento, salario_base, fecha_ingreso)
        self.lenguaje = lenguaje

    def calcular_salario(self):
        return self.salario_base



gerente = Gerente("Laura", "1001", 3000000, "2020", 1000000)
operario = Operario("Pedro", "2002", 0, "2022", 160, 10000)
dev = Desarrollador("Andres", "3003", 4000000, "2021", "Java")

empleados = [gerente, operario, dev]

for e in empleados:
    print("Tipo:", type(e).__name__)
    e.mostrar_info()
    print("Salario total:", e.calcular_salario())
    print("-------------------")
