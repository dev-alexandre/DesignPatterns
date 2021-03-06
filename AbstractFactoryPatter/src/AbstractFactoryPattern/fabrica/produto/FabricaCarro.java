package AbstractFactoryPattern.fabrica.produto;

import AbstractFactoryPattern.categoria.direcao.Direcao;
import AbstractFactoryPattern.categoria.direcao.DirecaoCarro;
import AbstractFactoryPattern.categoria.seguranca.Seguranca;
import AbstractFactoryPattern.categoria.seguranca.SegurancaCarro;
import AbstractFactoryPattern.fabrica.FabricaVeiculo;

public class FabricaCarro implements FabricaVeiculo {

    public Seguranca getSeguranca() {
        return new SegurancaCarro();
    }

    public Direcao getDirecao() {
        return new DirecaoCarro();
    }

}
