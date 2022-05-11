package practicaMona;

public class Robocat extends Mona{

    private boolean metalico;

    public Robocat (String nombre, String actividad, int id, String colorAtuendo, boolean accesorios, boolean metalico){
        super(nombre, actividad, id, colorAtuendo, accesorios);
        this.metalico = metalico;
    }

    public boolean getMetalico(){
        return metalico;
    }
}
