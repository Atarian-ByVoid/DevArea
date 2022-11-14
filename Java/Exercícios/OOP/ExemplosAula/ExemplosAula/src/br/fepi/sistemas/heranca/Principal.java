package br.fepi.sistemas.heranca;

public class Principal {
	
	
	public static void main(String[] args) {
		Veiculo v = new Veiculo("Civic", "Branco", "Honda", 0);
		System.out.println("O carro é um "+v.getMarca()+ " " + v.getNome()+ " "+ v.getCor());
		
		Carro c = new Carro();
		
		c.setNome("Gol");
		c.setCor("Vermelho");
		c.setMarca("VW");
		c.setVelocimetro(0);
		c.setPortaMalaAberto(false);
		c.setPortas(4);
		
		System.out.println(c.getNome() + " " + c.getCor() + " com " + c.getPortas() + " portas");
		
		
		Carro c2 = new Carro("Renegade", "Laranja", "Jeep", 0, 4, false);
		
		System.out.println(c2.getMarca() + " " + c2.getNome() + " "+ c2.getCor());
		
		for(int i=0; i<10; i++) {
			c.aumentaVelocidade();
		}
		System.out.println("Velocidade "+ c.getVelocimetro());
		
	}
}
