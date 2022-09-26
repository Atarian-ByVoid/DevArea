package inicio;

public class Carro {
	private String marca;
	private String cor;
	private boolean motorLigado;
	
private void ligaMotor() {
	
	if(motorLigado==true)
		System.out.println("Motor ligado");
	
	else {
		motorLigado=true;
				System.out.println("Motor desligado");
	}
	
}	

private void mostraAtributos() {
	System.out.println("Marca: " +marca);
	System.out.println("Cor: " +cor);
	if(motorLigado==true)
		System.out.println("Seu motor esta ligado");
	else
		System.out.println("Seu motor esta desligado");
	
}
	
public static void main (String args[]) {
Carro c = new Carro("Fiat","Cinza",false);
c.marca="Fiat";	
c.cor="Cinza";

c.mostraAtributos();
System.out.println("_______________");
c.ligaMotor();
System.out.println("_______________");
c.mostraAtributos();
System.out.println("_______________");
c.ligaMotor();
System.out.println("_______________");

}
	
	public Carro(String marca, String cor , boolean motorLigado) {
		this.marca=marca;
		this.cor=cor;
		this.motorLigado= motorLigado;
		
	}





}

