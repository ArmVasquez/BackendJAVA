package practicaMona;

public class Octodex {
    public static void main(String[] args) {
        define();
    }

    public static void define(){
        Labtocat lb = new Labtocat("Labtocat", "experimentar", 104, "blanco", true, "bata", "lentes de proteccion");
        System.out.println("Su nombre es "+lb.getNombre()+" y le encanta la actividad de "+lb.getActividad()+". Su numero de ID es "+lb.getId()+
                ". Su atuendo es de color "+lb.getColorAtuendo()+". Tiene accesorios? "+lb.getAccesorios()+". Sus accesorios son: " +
                lb.getAccesorio1()+" y "+lb.getAccesorio2());

        Robocat rb = new Robocat("Robocat", "ser un robot", 92, "gris", false, true);
        System.out.println("Su nombre es "+rb.getNombre()+" y le encanta la actividad de "+rb.getActividad()+". Su numero de ID es "+rb.getId()+
                ". Su atuendo es de color "+rb.getColorAtuendo()+". Tiene accesorios? "+rb.getAccesorios()+". Es un robot de metal? "+rb.getMetalico());

        DrOctocat doc = new DrOctocat("Dr. Octocat", "ser un villano", 88, "verde", true, 4);
        System.out.println("Su nombre es "+doc.getNombre()+" y le encanta la actividad de "+doc.getActividad()+". Su numero de ID es "+doc.getId()+
                ". Su atuendo es de color "+doc.getColorAtuendo()+". Tiene accesorios? "+doc.getAccesorios()+". Cuantos brazos extra tiene? "+doc.getBrazos());

        Dodgecat dc = new Dodgecat("Dodgecat", "dodgeball", 85, "azul claro", true, "banda", "pelotas");
        System.out.println("Su nombre es "+dc.getNombre()+" y le encanta la actividad de "+dc.getActividad()+". Su numero de ID es "+dc.getId()+
                ". Su atuendo es de color "+dc.getColorAtuendo()+". Tiene accesorios? "+dc.getAccesorios()+". Sus accesorios son: " +
                dc.getAccesorio1()+" y "+dc.getAccesorio2());

        Linktocat lc = new Linktocat("Linktocat", "ser el Heroe del Tiempo", 59, "verde", true, "espada maestra",
                "escudo", "gorro verde");
        System.out.println("Su nombre es "+lc.getNombre()+" y le encanta la actividad de "+lc.getActividad()+". Su numero de ID es "+lc.getId()+
                ". Su atuendo es de color "+lc.getColorAtuendo()+". Tiene accesorios? "+lc.getAccesorios()+". Sus accesorios son: " +
                lc.getAccesorio1()+", "+lc.getAccesorio2()+" y "+lc.getAccesorio3());

        Jetpacktocat jp = new Jetpacktocat("Jetpacktocat", "volar con su jetpack", 116, "amarillo", true,
                1550.5, "cohete");
        System.out.println("Su nombre es "+jp.getNombre()+" y le encanta la actividad de "+jp.getActividad()+". Su numero de ID es "+jp.getId()+
                ". Su atuendo es de color "+jp.getColorAtuendo()+". Tiene accesorios? "+jp.getAccesorios()+". Vuela a una altura en metros de: " +
                jp.getAlturaVuelo()+" y utiliza motores para su jetpack de tipo: "+jp.getTipoMotor());
    }
}
