class Pago:
    def __init__(self, monto, fecha, estado):
        self.monto = monto
        self.fecha = fecha
        self.estado = estado

    def mostrar_info(self):
        print("Monto:", self.monto)
        print("Fecha:", self.fecha)
        print("Estado:", self.estado)

    def procesar_pago(self):
        pass


class Tarjeta(Pago):
    def __init__(self, monto, fecha, estado, numero, banco):
        super().__init__(monto, fecha, estado)
        self.numero = numero
        self.banco = banco

    def procesar_pago(self):
        print(f"Pago con tarjeta aprobado. Banco: {self.banco}")


class Efectivo(Pago):
    def __init__(self, monto, fecha, estado, entregado):
        super().__init__(monto, fecha, estado)
        self.entregado = entregado

    def procesar_pago(self):
        cambio = self.entregado - self.monto
        print("Pago en efectivo. Cambio:", cambio)


class Transferencia(Pago):
    def __init__(self, monto, fecha, estado, cuenta, banco):
        super().__init__(monto, fecha, estado)
        self.cuenta = cuenta
        self.banco = banco

    def procesar_pago(self):
        print(f"Transferencia realizada desde la cuenta: {self.cuenta}")



p1 = Tarjeta(50000, "2026-03-25", "Aprobado", "1234-5678", "Bancolombia")
p2 = Efectivo(30000, "2026-03-25", "Pendiente", 50000)
p3 = Transferencia(70000, "2026-03-25", "Aprobado", "987654", "Davivienda")

pagos = [p1, p2, p3]

for p in pagos:
    print("Tipo:", type(p).__name__)
    p.mostrar_info()
    p.procesar_pago()
    print("-------------------")
