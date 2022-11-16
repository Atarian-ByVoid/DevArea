package pessoas;

public class Pessoa {

    private EstadoCivilEnum estadoCivil;

    public EstadoCivilEnum getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivilEnum estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Pessoa() {
        System.out.println("Constructor 1");

    }

}
