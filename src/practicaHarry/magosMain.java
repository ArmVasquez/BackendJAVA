package practicaHarry;

public class magosMain {
    public static void main(String[] args) {
        def();
    }

    public static void def(){
        HarryPotter hp = new HarryPotter();
        hp.setNombre("Harry Potter");
        hp.setGenero("Masculino");
        hp.setCasaHogwarts("Gryffindor");
        hp.setPatronus("Ciervo");
        hp.setBoggart("Dementor");
        System.out.println("El es "+hp.getNombre()+" y es de genero "+hp.getGenero()+
                ". Pertenece a la casa "+hp.getCasaHogwarts()+". Su Patronus es un "+
                hp.getPatronus()+" y su Boggart es un "+hp.getBoggart());

        ChoChang cc = new ChoChang();
        cc.setNombre("Cho Chang");
        cc.setGenero("Femenino");
        cc.setCasaHogwarts("Ravenclaw");
        cc.setPatronus("Cisne");
        cc.setBoggart("Voldemort");
        System.out.println("Ella es "+cc.getNombre()+" y es de genero "+cc.getGenero()+
                ". Pertenece a la casa "+cc.getCasaHogwarts()+". Su Patronus es un "+
                cc.getPatronus()+" y su Boggart es "+cc.getBoggart());

        AlbusDumbledore ad = new AlbusDumbledore();
        ad.setNombre("Albus Dumbledore");
        ad.setGenero("Masculino");
        ad.setCasaHogwarts("Gryffindor");
        ad.setPatronus("Fenix");
        ad.setBoggart("el cuerpo de su hermana");
        System.out.println("El es "+ad.getNombre()+" y es de genero "+ad.getGenero()+
                ". Pertenece a la casa "+ad.getCasaHogwarts()+". Su Patronus es un "+
                ad.getPatronus()+" y su Boggart es "+ad.getBoggart());

        NewtonScamander ns = new NewtonScamander();
        ns.setNombre("Newton Scamander");
        ns.setGenero("Masculino");
        ns.setCasaHogwarts("Hufflepuff");
        ns.setPatronus("desconocido");
        ns.setBoggart("trabajar en una oficina");
        System.out.println("El es "+ns.getNombre()+" y es de genero "+ns.getGenero()+
                ". Pertenece a la casa "+ns.getCasaHogwarts()+". Su Patronus es "+
                ns.getPatronus()+" y su Boggart es "+ns.getBoggart());

        TomRiddle tr = new TomRiddle();
        tr.setNombre("Tom Riddle");
        tr.setGenero("Masculino");
        tr.setCasaHogwarts("Slytherin");
        tr.setPatronus("desconocido");
        tr.setBoggart("su propia muerte");
        System.out.println("El es "+tr.getNombre()+" y es de genero "+tr.getGenero()+
                ". Pertenece a la casa "+tr.getCasaHogwarts()+". Su Patronus es "+
                tr.getPatronus()+" y su Boggart es "+tr.getBoggart());

    }
}
