package oop_portal1;



public class Disciplina {//atributos do meu objeto "Disciplina"
	
	private int codigo;
	private String nome;
	private int cargaHoraria;

	
	public Disciplina( int codigo,String nome, int cargaHoraria) { //Metodo construtor, para iniciar as variaveis
		 this.codigo = codigo;
		 this.nome = nome;
		 this.cargaHoraria = cargaHoraria;
	}
	
	public int getCodigo() { 
		return this.codigo;
	}
	public void setCodigo(int codigo) { 
		 this.codigo= codigo;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "{"+"codigo="+getCodigo()+"'"+",nome='"+ getNome() +"'"+",cargaHoraria='"+ getCargaHoraria()+"'"+"}";
		
		
	
	}
	
	}

	