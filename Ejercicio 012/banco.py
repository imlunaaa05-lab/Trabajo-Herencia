class Cuenta:
    def __init__(self, numero, titular, saldo, estado):
        self.numero = numero
        self.titular = titular
        self.saldo = saldo
        self.estado = estado

    def mostrar_info(self):
        print("Cuenta:", self.numero)
        print("Titular:", self.titular)
        print("Saldo:", self.saldo)
        print("Estado:", self.estado)

    def operar(self):
        pass


class CuentaAhorros(Cuenta):
    def operar(self):
        interes = self.saldo * 0.02
        print("Interés generado:", interes)


class CuentaCorriente(Cuenta):
    def operar(self):
        print("Tiene sobregiro disponible de: 500000")


class CuentaEstudiante(Cuenta):
    def operar(self):
        print("Cuenta sin comisiones")



c1 = CuentaAhorros("001", "Ana", 1000000, "Activa")
c2 = CuentaCorriente("002", "Carlos", 500000, "Activa")
c3 = CuentaEstudiante("003", "Luis", 200000, "Activa")

cuentas = [c1, c2, c3]

for c in cuentas:
    print("Tipo:", type(c).__name__)
    c.mostrar_info()
    c.operar()
    print("-------------------")
