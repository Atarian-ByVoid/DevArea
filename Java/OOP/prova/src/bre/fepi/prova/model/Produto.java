package bre.fepi.prova.model;

public class Produto {
	private String Descricao;
	private String Id;
	private float Preco;
	private String Validade;
	
	public Produto (String Descricao,String Id,float Preco,String Validade) {
		
		this.Descricao= Descricao;
		this.Id=Id;
		this.Preco=Preco;
		this.Validade=Validade;		
		
	}
	
	public static void main(String []args) {
		Descricao d = new Descricao("test");
		Id i = new Id ();
		Preco p = new Preco();
		Validade v = new Validade();
		
		System.out.println("Descri��o"+d.getNome()+"Id"+i+"");

		
	}

}
