package Abstratas;

import Enums.Sexos;

abstract public class Pessoa extends Padrao{
    private Sexos sexo;

    public Pessoa() {
        super();
        this.setSexo(Sexos.M);
    }
    public Pessoa(String nome, Sexos sexo) {
        super(nome);
        this.setSexo(sexo);
    }

    public Sexos getSexo() {
        return sexo;
    }
    public void setSexo(Sexos sexo) {
        this.sexo = sexo;
    }    
}
