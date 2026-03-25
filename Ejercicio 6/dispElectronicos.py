class Dispositivo:
    def __init__(self, marca, referencia, consumo, estado):
        self.marca = marca
        self.referencia = referencia
        self.consumo = consumo
        self.estado = estado

    def mostrar_info(self):
        print("Marca:", self.marca)
        print("Referencia:", self.referencia)
        print("Consumo:", self.consumo)
        print("Estado:", self.estado)

    def funcion(self):
        pass


class Celular(Dispositivo):
    def funcion(self):
        print("Tiene cámara y es un objeto de bolsillo")


class Laptop(Dispositivo):
    def funcion(self):
        print("Tiene cámara y es de tamaño mediano")


class Televisor(Dispositivo):
    def funcion(self):
        print("No tiene cámara, pero tiene bocinas y es de tamaño grande")


celular = Celular("Samsung", "S21", 15, "Encendido")
laptop = Laptop("HP", "Pavilion", 65, "Apagado")
tv = Televisor("LG", "OLED", 120, "Encendido")

dispositivos = [celular, laptop, tv]

for d in dispositivos:
    print("Tipo:", type(d).__name__)
    d.mostrar_info()
    d.funcion()
    print("-------------------")
