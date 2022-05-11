package practicaMona;

public class DrOctocat extends Mona{

    private int brazos;


    public DrOctocat (String nombre, String actividad, int id, String colorAtuendo, boolean accesorios, int brazos){
        super(nombre, actividad, id, colorAtuendo, accesorios);
        this.brazos = brazos;
    }

    public int getBrazos(){
        return brazos;
    }
}
