package br.com.zup.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Restaurante> pratosRestuarante = new ArrayList<>();

    public Restaurante(List<Restaurante> pratosRestuarante) {
        this.pratosRestuarante = pratosRestuarante;
    }

    public List<Restaurante> getPratosRestuarante() {
        return pratosRestuarante;
    }
    public void adicionarPrato (Restaurante prato){
        pratosRestuarante.add(prato);
    }
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Pratos do dia: " + pratosRestuarante);
        retorno.append("\n\n");
        return retorno.toString();
    }
}
