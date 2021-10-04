package br.com.zup.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private List<Imovel> imovel = new ArrayList<>();

    public Imobiliaria() {

    }

    public Imobiliaria(List<Imovel> imovel) {

        this.imovel = imovel;
    }

    public List<Imovel> getImovel() {

        return imovel;
    }

    public void setImovel(List<Imovel> imovel) {

        this.imovel = imovel;
    }

    public void adicionarImovel(Imovel imovel) {

        this.imovel.add(imovel);
    }

    public void buscarImovel(String enderecoImovel, String cpf) {
        Imovel imovelASerEncontrado = null;
        Moradores moradorASerExcluido = null;

        for (Imovel referencia : imovel) {
            if (referencia.getEnderecoImovel().equals(enderecoImovel)) {
                imovelASerEncontrado = referencia;
                System.out.println("Imovel encontrado via endereço. ");

                for (Moradores referenciaMorador : referencia.getMoradores()) {
                    if (referenciaMorador.getCpf().equals(cpf)){
                       moradorASerExcluido = referenciaMorador;
                        System.out.println("Morador excluido");
                    }

                }
                referencia.getMoradores().remove(moradorASerExcluido);
            }

        }

    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Numero de imoveis cadastrados: " + imovel.size());
        retorno.append("\n informações imóvel: " + imovel);
        retorno.append("\n\n");
        return retorno.toString();
    }
}
