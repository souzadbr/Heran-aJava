package br.com.zup.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Pratos> pratosRestaurante = new ArrayList<>();

    public Cardapio(List<Pratos> pratosRestuarante) {
        this.pratosRestaurante = pratosRestuarante;
    }

    public Cardapio() {

    }

    public List<Pratos> getPratosRestaurante() {
        return pratosRestaurante;
    }


    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Pratos do dia: " + pratosRestaurante);
        retorno.append("\n\n");
        return retorno.toString();
    }
}
