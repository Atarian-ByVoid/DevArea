package model;

public class Cachorro extends Animal {

    public void late(){
        System.out.println(getNome()+": Au Au");
    }
    
    public void caminha(){
        System.out.println("O cachorro "+getNome()+" está saltitando");

    }
}
