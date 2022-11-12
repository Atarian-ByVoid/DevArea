package poo;

public class Impala {

	public static void main(String[] args) {
		Carro impala = new Carro();
		impala.ano = 1968;
		impala.cor = "Vermelhor";
		System.out.println("Carro: Ferrari");
		System.out.println("Ano: " + impala.ano);
		System.out.println("Cor: " + impala.cor);
		impala.ligar();
		impala.acelerar();
		impala.desligar();


	}

}
