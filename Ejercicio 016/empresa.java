class Empleado {
    String nombre,id;

    public Empleado(String n,String i){
        nombre=n;
        id=i;
    }

    public void rol(){}
}

class Desarrollador extends Empleado{
    public Desarrollador(String n,String i){ super(n,i); }
    public void rol(){ System.out.println("Desarrolla software"); }
}

class Tester extends Empleado{
    public Tester(String n,String i){ super(n,i); }
    public void rol(){ System.out.println("Prueba aplicaciones"); }
}

class ProjectManager extends Empleado{
    public ProjectManager(String n,String i){ super(n,i); }
    public void rol(){ System.out.println("Gestiona proyectos"); }
}

public class Main {
    public static void main(String[] args){

        Empleado[] lista={
            new Desarrollador("Ana","01"),
            new Tester("Luis","02"),
            new ProjectManager("Carlos","03")
        };

        for(Empleado e:lista){
            System.out.println(e.getClass().getSimpleName());
            e.rol();
            System.out.println("-----");
        }
    }
}
