package pessoas;

public class App {

  public static void main(String[] args){

    Pessoa p = new Pessoa();
    Pessoa p1 = new Pessoa();
    Pessoa p2 = new Pessoa();

    p.setEstadoCivil(EstadoCivilEnum.solteiro);
    p1.setEstadoCivil(EstadoCivilEnum.casado);
    p2.setEstadoCivil(EstadoCivilEnum.viuvo);


    System.out.println("Estado civil: "+ p.getEstadoCivil());
    System.out.println("Estado civil: "+ p1.getEstadoCivil());
    System.out.println("Estado civil: "+ p2.getEstadoCivil());





}
  
}
