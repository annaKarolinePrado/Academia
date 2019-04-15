package Objetos;

import Abstratas.Padrao;
import java.util.LinkedList;

public class Modalidade extends Padrao{
    private double preco;
    
    public Modalidade(){
        super();
        this.setPreco(0.01);
    }
    public Modalidade(String nome, double preco){
        super(nome); 
        this.setPreco(preco);
    }

    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double valor) {
        this.preco = valor <= 0 ? 1 : valor;
    }    
}
