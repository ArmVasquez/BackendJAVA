package practicaMona;

public class Jetpacktocat extends Mona{

    private double alturaVuelo;
    private String tipoMotor;

    public Jetpacktocat(String nombre, String actividad, int id, String colorAtuendo, boolean accesorios, double alturaVuelo, String tipoMotor) {
        super(nombre, actividad, id, colorAtuendo, accesorios);
        this.alturaVuelo = alturaVuelo;
        this.tipoMotor = tipoMotor;
    }

    public double getAlturaVuelo() {
        return alturaVuelo;
    }
    public String getTipoMotor() {
        return tipoMotor;
    }
}
