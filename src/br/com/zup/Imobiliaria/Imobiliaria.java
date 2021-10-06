package br.com.zup.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private List<Imovel> imoveis = new ArrayList<>();

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public void adicionarImovel(Imovel imovel){
        imoveis.add(imovel);
    }

    //  public void buscarImovel(String enderecoImovel, String cpf) {
   //     Imovel imovelASerEncontrado = null;
   //     Moradores moradorASerExcluido = null;

  //      for (Imovel referencia : imovel) {
  //          if (referencia.getEnderecoImovel().equals(enderecoImovel)) {
   //             imovelASerEncontrado = referencia;
   //             System.out.println("Imovel encontrado via endereço. ");

   //             for (Moradores referenciaMorador : referencia.getMoradores()) {
   //                 if (referenciaMorador.getCpf().equals(cpf)){
   //                    moradorASerExcluido = referenciaMorador;
   //                     System.out.println("Morador excluido");
   //                 }

     //           }
         //       referencia.getMoradores().remove(moradorASerExcluido);
   //         }

   //     }

  //  }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Numero de imoveis cadastrados: " + imoveis.size());
        retorno.append("\n informações imóvel: " + imoveis);
        retorno.append("\n\n");
        return retorno.toString();
    }
}
