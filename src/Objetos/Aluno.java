package Objetos;

import Abstratas.Pessoa;
import Enums.Periodicidade;
import Enums.Sexos;
import java.util.LinkedList;

public class Aluno extends Pessoa{
    private int idade;
    private String cpf;
    private String telefone;
    private LinkedList<Modalidade> modalidade = new LinkedList<>();
    private Instrutor instrutor;
    private Periodicidade periodicidade;
    
    public Aluno() {
        super();
        this.setIdade(0);
        this.setCpf("000.000.000-00");
        this.setTelefone("(00)00000-0000");
        this.setInstrutor(null);
        this.setPeriodicidade(Periodicidade.X1);
    }
    public Aluno(String nome, Sexos sexo, int idade, String cpf, String telefone, LinkedList<Modalidade> modalidade, Instrutor instrutor, Periodicidade periodicidade) {
        super(nome, sexo);
        this.setIdade(idade);
        this.setCpf(cpf);
        this.setTelefone(telefone);
        this.setInstrutor(instrutor);
        this.setPeriodicidade(periodicidade);
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade <= 0 ? 1 : idade;
    }

    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf.trim().isEmpty() ? "000.000.000-00" : cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone.trim().isEmpty() ? "(00)00000-0000" : telefone;
    }

    public LinkedList<Modalidade> getModalidade() {
        return this.modalidade;
    }

    public Instrutor getInstrutor() {
        return this.instrutor;
    }
    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor == null ? new Instrutor() : instrutor;
    }

    public Periodicidade getPeriodicidade() {
        return this.periodicidade;
    }
    public void setPeriodicidade(Periodicidade periodicidade) {
        this.periodicidade = periodicidade;
    }  
}
