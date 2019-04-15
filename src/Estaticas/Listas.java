package Estaticas;

import Objetos.Aluno;
import Objetos.Instrutor;
import Objetos.Modalidade;
import java.util.LinkedList;

abstract public class Listas {
    private static LinkedList<Aluno> listaAluno = new LinkedList<>();
    private static LinkedList<Instrutor> listaInstrutor = new LinkedList<>();
    private static LinkedList<Modalidade> listaModalidade = new LinkedList<>();

    public static LinkedList<Aluno> getListaAluno() {
        return listaAluno;
    }

    public static LinkedList<Instrutor> getListaInstrutor() {
        return listaInstrutor;
    }

    public static LinkedList<Modalidade> getListaModalidade() {
        return listaModalidade;
    }    
}
