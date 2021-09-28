package br.com.zup.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private List <Imovel> imovel = new ArrayList<>();

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
    public void adicionarImovel (Imovel imovel){
       this.imovel.add(imovel);
    }
    @Override
    public String toString (){
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Numero de imoveis cadastrados: "+ imovel.size());
        retorno.append("\n informações imóvel: "+ imovel);
        retorno.append("\n\n");
        return retorno.toString();
    }
}
