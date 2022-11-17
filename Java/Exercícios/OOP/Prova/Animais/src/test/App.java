package test;

import model.Cachorro;
import model.Gato;

public class App {
    public static void main(String[] args) throws Exception {

        Cachorro c = new Cachorro();
        c.setNome("Bob");
        c.setRaca("Labrador");


        Gato g = new Gato();
        g.setNome("Molly");
        g.setRaca("Amarelo");

        c.late();
        g.mia();



    }
}
