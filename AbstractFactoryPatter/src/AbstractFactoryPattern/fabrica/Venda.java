package AbstractFactoryPattern.fabrica;

import AbstractFactoryPattern.categoria.direcao.Direcao;
import AbstractFactoryPattern.categoria.seguranca.Seguranca;

public class Venda {

    private Seguranca seguranca;
    private Direcao direcao;

    public Venda(FabricaVeiculo fabrica){
        seguranca = fabrica.getSeguranca();
        direcao = fabrica.getDirecao();
    }

    public void vender(){
        seguranca.getSeguranca();
        direcao.getDirecao();
    }
}
