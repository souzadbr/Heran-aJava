package br.com.zup.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Pratos>pratosRestuarante = new ArrayList<>();

    public Restaurante(List<Pratos> pratosRestuarante) {
        this.pratosRestuarante = pratosRestuarante;
    }

    public List<Pratos> getPratosRestuarante() {
        return pratosRestuarante;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Pratos do dia: " + pratosRestuarante);
        retorno.append("\n\n");
        return retorno.toString();
    }
}
