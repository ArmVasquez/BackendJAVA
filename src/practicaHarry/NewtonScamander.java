package practicaHarry;

public class NewtonScamander {
    private String nombre;
    private String genero;
    private String casaHogwarts;
    private String patronus;
    private String boggart;

    public String getNombre(){
        return nombre;
    }
    public String getGenero(){
        return genero;
    }
    public String getCasaHogwarts(){
        return casaHogwarts;
    }
    public String getPatronus(){
        return patronus;
    }
    public String getBoggart(){
        return boggart;
    }

    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }
    public boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero = genero;
            return true;
        } else
            return false;
    }
    public boolean setCasaHogwarts(String casaHogwarts){
        if (!casaHogwarts.isEmpty()){
            this.casaHogwarts = casaHogwarts;
            return true;
        } else
            return false;
    }
    public boolean setPatronus(String patronus){
        if (!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        } else
            return false;
    }
    public boolean setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return
                "nombre: "+nombre+
                        "\ngenero: "+genero+
                        "\ncasa: "+casaHogwarts+
                        "\npatronus: "+patronus+
                        "\nboggart: "+boggart;
    }
}
