package Enums;

public enum Sexos {
    F ("Feminino"),
    M ("Masculino");
    
    private String descricao;

    private Sexos(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }   
}
