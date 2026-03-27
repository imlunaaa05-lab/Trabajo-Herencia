class FiguraGrafica:
    def dibujar(self):
        pass


class Circulo(FiguraGrafica):
    def dibujar(self):
        print("Dibujando círculo")


class Rectangulo(FiguraGrafica):
    def dibujar(self):
        print("Dibujando rectángulo")


class Linea(FiguraGrafica):
    def dibujar(self):
        print("Dibujando línea")


figuras=[Circulo(),Rectangulo(),Linea()]

for f in figuras:
    f.dibujar()
