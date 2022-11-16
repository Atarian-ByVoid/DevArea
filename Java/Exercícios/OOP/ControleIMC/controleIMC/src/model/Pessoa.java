package model;

public class Pessoa {

    private String nome;
    private float peso;
    private float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void mostraDados() {
        System.out.println("===DADOS===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("IMC: "+this.calcularIMC());
        System.out.println();
    }

    public float calcularIMC() {
        return (peso / (altura * altura));

    }

    public Pessoa() {

    }

    public Pessoa(String nome, float peso, float altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

}
