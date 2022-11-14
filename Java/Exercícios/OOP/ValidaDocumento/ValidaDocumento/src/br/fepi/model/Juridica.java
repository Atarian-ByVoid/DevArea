package br.fepi.model;

public class Juridica extends Pessoa{

	private String cnpj;
	
	public Juridica() {
	
	}

	public Juridica(String cnpj) {
		this.cnpj = cnpj;
	}

	public boolean validarDocumento() {
		
		if(cnpj.length()==14) 
			return true;
		
		return false;	
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
