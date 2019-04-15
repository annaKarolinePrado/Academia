package Abstratas;

abstract public class Padrao {
    private String nome;

    public Padrao() {
        this.setNome("PARDÃO");
    }
    public Padrao(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "PARDÃO" : nome.toUpperCase();
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
