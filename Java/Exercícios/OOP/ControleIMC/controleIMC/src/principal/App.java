package principal;

import java.util.ArrayList;

import model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Pessoa>pacientes = new ArrayList<Pessoa>();

        Pessoa p1= new Pessoa("Carlos ", 60f,1.95f);
        Pessoa p2= new Pessoa("Pedro ", 74f,1.85f);
        Pessoa p3= new Pessoa("Sabrina ", 78f,1.76f);
        Pessoa p4= new Pessoa("Fabricio  ", 87f,1.79f);
        Pessoa p5= new Pessoa("Pedro Gomes ", 65f,1.54f);

        pacientes.add(p1);
        pacientes.add(p2);
        pacientes.add(p3);
        pacientes.add(p4);
        pacientes.add(p5);

        for (Pessoa pessoa : pacientes) {
            pessoa.mostraDados();
        
        }

        float soma=0;
        for (Pessoa pessoa : pacientes) { 
            soma=soma+pessoa.calcularIMC();           
        }
        System.out.println("Média de IMC: "+soma/5);


       /*p1.mostraDados();
        System.out.println("IMC: "+p1.calcularIMC());

        p2.calcularIMC();
        System.out.println("IMC: "+p2.calcularIMC()); */ 






    }
}
