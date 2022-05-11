package practicaMona;

public class Mona {
    private String nombre;
    private String actividad;
    private int id;
    private String colorAtuendo;
    private boolean accesorios;

    public Mona(String nombre, String actividad, int id, String colorAtuendo, boolean accesorios){
        this.nombre = nombre;
        this.actividad = actividad;
        this.id = id;
        this.colorAtuendo = colorAtuendo;
        this.accesorios = accesorios;
    }

    public String getNombre(){
        return nombre;
    }
    public String getActividad(){
        return actividad;
    }
    public int getId(){
        return id;
    }
    public String getColorAtuendo(){
        return colorAtuendo;
    }
    public boolean getAccesorios(){
        return accesorios;
    }

    public String showMessage() {
        return "nombre: "+nombre+" actividad: "+actividad+" id: "+id+" color de atuendo: "+colorAtuendo+" ¿tiene accesorios?: "+accesorios;
    }

}
