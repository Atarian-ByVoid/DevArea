package matematica;
public class Matematica{

    public void imprime(String nome, String sexo,int idade ){
        //imprimir um 
        System.out.println("Nome: "+nome);
        System.out.println("sexo: "+sexo);
        System.out.println("idade: "+idade);

        int resultado = soma(10,20);
        System.out.println("Resultado = "+resultado);

 }
    private int soma(int a, int b){
        return a+b;


    }

    
}