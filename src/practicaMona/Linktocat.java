package practicaMona;

public class Linktocat extends Mona{

    private String accesorio1;
    private String accesorio2;
    private String accesorio3;

    public Linktocat (String nombre, String actividad, int id, String colorAtuendo, boolean accesorios, String accesorio1, String accesorio2, String accesorio3) {
        super(nombre, actividad, id, colorAtuendo, accesorios);
        this.accesorio1 = accesorio1;
        this.accesorio2 = accesorio2;
        this.accesorio3 = accesorio3;
    }

    public String getAccesorio1(){
        return accesorio1;
    }
    public String getAccesorio2(){
        return accesorio2;
    }
    public String getAccesorio3(){
        return accesorio3;
    }

}
