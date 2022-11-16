package model;

public class Circulo {

    public Circulo() {
    }

    private int centroX;
    private int centroY;
    private int raio;

    private static final double PI = 3.1415f;

    public int getCentroX() {
        return centroX;
    }

    public void setCentroX(int centroX) {
        this.centroX = centroX;
    }

    public int getCentroY() {
        return centroY;
    }

    public void setCentroY(int centroY) {
        this.centroY = centroY;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public Circulo(int centroX, int centroY, int raio) {
        this.centroX = centroX;
        this.centroY = centroY;
        this.raio = raio;
    }

    public double area() {
        return PI * raio * raio;
    }

    public double circuferencia() {
        return 2 * PI * raio;
    }

    public int diametro() {
        return 2 * raio;

    }

    public void mover(int novoX, int novoY){
        this.centroX = novoX;
        this.centroY = novoY;

    }

    public void aumentarRaio(){
        this.raio++;

    }

    public void diminuirRaio(){
        this.raio--;

}

public void imprimeDados(){
    System.out.println("DADOS DO CIRCULO");
    System.out.println("Posição: ("+this.centroX+","+this.centroY+")");
    System.out.println("Raio:"+this.raio);

    System.out.println("______________________________________________-");

    System.out.println("Área: "+this.area());
    System.out.println("Circuferencia: "+this.circuferencia());
    System.out.println("Diametro: "+this.diametro());

}
}