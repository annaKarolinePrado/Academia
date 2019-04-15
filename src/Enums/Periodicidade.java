package Enums;

public enum Periodicidade {
    X1("1 Vez por Semana"),
    X2("2 Vez por Semana"),
    X3("3 Vez por Semana"),
    X4("4 Vez por Semana"),
    X5("5 Vez por Semana"),
    X6("6 Vez por Semana"),
    X7("7 Vez por Semana");
    
    private String descricao;

    private Periodicidade(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }    
}
