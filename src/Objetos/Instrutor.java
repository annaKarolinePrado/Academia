package Objetos;

import Abstratas.Pessoa;
import Enums.Sexos;

public class Instrutor extends Pessoa{
    private Modalidade modalidade;

    public Instrutor(){
        super();
        this.setModalidade(null);
    }
    public Instrutor(String nome, Sexos sexo, Modalidade modalidade) {
        super(nome, Sexos.F);
        this.setModalidade(modalidade);
    }

    public Modalidade getModalidade() {
        return modalidade;
    }
    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade == null ? new Modalidade() : modalidade;
    }    
}
