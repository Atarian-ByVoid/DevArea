package principal;

import model.Circulo;

public class App {
    public static void main(String[] args) throws Exception {

        Circulo c = new Circulo();
        c.setCentroX(20);
        c.setCentroY(20);
        c.setRaio(20);

        c.imprimeDados();

        c.mover(23, 123);
        c.aumentarRaio();

        c.imprimeDados();



        
    }
}
