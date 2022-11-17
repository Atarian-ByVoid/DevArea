package test;

import java.util.ArrayList;

import model.Animal;
import model.Cachorro;
import model.Gato;

public class App {
    public static void main(String[] args) throws Exception {

        Cachorro c = new Cachorro();
        c.setNome("Bob");
        c.setRaca("Labrador");
        Cachorro c2 = new Cachorro();
        c2.setNome("Sckot");
        c2.setRaca("Dog Alemão");
        Cachorro c3 = new Cachorro();
        c3.setNome("Leon");
        c3.setRaca("Borsoi");

        Gato g = new Gato();
        g.setNome("Molly");
        g.setRaca("Amarelo");
        Gato g2 = new Gato();
        g2.setNome("Judity");
        g2.setRaca("Preto");
        Gato g3 = new Gato();
        g3.setNome("Twig");
        g3.setRaca("Branco");

        ArrayList<Animal> animais = new ArrayList<>();
            animais.add(c);
            animais.add(c2);
            animais.add(c3);

            animais.add(g);
            animais.add(g2);
            animais.add(g3);

        for (Animal animal : animais) {
            animal.caminha();

           
            
        }



    }
}
