class FiguraGrafica{
    public void dibujar(){}
}

class Circulo extends FiguraGrafica{
    public void dibujar(){ System.out.println("Dibujando círculo"); }
}

class Rectangulo extends FiguraGrafica{
    public void dibujar(){ System.out.println("Dibujando rectángulo"); }
}

class Linea extends FiguraGrafica{
    public void dibujar(){ System.out.println("Dibujando línea"); }
}

public class Main{
    public static void main(String[] args){

        FiguraGrafica[] figuras={
            new Circulo(),
            new Rectangulo(),
            new Linea()
        };

        for(FiguraGrafica f:figuras){
            f.dibujar();
        }
    }
}
