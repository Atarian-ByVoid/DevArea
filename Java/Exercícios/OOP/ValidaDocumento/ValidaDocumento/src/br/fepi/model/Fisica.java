package br.fepi.model;

public class Fisica extends Pessoa{
	private String cpf;
	
	public boolean validarDocumento() {
		if(cpf.length() == 11)
			return true;
		
		return false;
	}

	public Fisica() {
	}
	
	public Fisica(String cpf) {
		this.cpf = cpf;
	}
	
	public Fisica(String nome, String cpf){
		super(nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
