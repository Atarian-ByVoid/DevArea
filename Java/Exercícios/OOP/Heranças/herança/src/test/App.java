package test;

import java.util.ArrayList;

import model.Animal;
import model.Cachorro;
import model.Gato;
import model.Papagaio;

public class App {
    public static void main(String[] args) throws Exception {

        Cachorro dog1= new Cachorro();
        dog1.setNome("Sckot");
        dog1.setRaca("Labrador");

        Gato cat1 = new Gato();
        cat1.setNome("Zelda");
        cat1.setRaca("Persa");

        Papagaio bird1= new Papagaio();
        bird1.setNome("Loro");
        bird1.setRaca("Papagaio-do-mangue");


        dog1.caminha();
        dog1.late();

        cat1.mia();
        cat1.caminha();

        bird1.caminha();
        bird1.canta();

        System.out.println("Animais caminhando....");


        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(dog1);
        animais.add(cat1);
        animais.add(bird1);


        for (Animal animal : animais) {
            animal.caminha();

            
        }




    }
}
