package practicaMona;

public class Dodgecat extends Mona{

    private String accesorio1;
    private String accesorio2;

    public Dodgecat(String nombre, String actividad, int id, String colorAtuendo, boolean accesorios, String accesorio1, String accesorio2){
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
