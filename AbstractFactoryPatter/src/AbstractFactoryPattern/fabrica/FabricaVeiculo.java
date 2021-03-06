package AbstractFactoryPattern.fabrica;

import AbstractFactoryPattern.categoria.direcao.Direcao;
import AbstractFactoryPattern.categoria.seguranca.Seguranca;

public interface FabricaVeiculo {

    Seguranca getSeguranca();
    Direcao getDirecao();

}
