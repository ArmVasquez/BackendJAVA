package practicaMona;

public class Labtocat extends Mona{

    String accesorio1;
    String accesorio2;

    public Labtocat(String nombre, String actividad, int id, String colorAtuendo, boolean accesorios, String accesorio1, String accesorio2) {
        super(nombre, actividad, id, colorAtuendo, accesorios);
        this.accesorio1 = accesorio1;
        this.accesorio2 = accesorio2;
    }

    public String getAccesorio1(){
        return accesorio1;
    }
    public String getAccesorio2(){
        return accesorio2;
    }

}
