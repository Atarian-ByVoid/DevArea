package cachorro;

public class Cachorro {
    public int tamanho;
    public String raca;

    public Cachorro(){
        System.out.println("Construtor 1");
    }

    public Cachorro(int t, String raca) {
        System.out.println("Construtor 2");
        
        this.tamanho = t;
        this.raca= raca;

    }

    public void latir(){
        System.out.println("Au Au Au Au");  
    }
    
}

