package AbstractFactoryPattern.fabrica.produto;

import AbstractFactoryPattern.categoria.direcao.Direcao;
import AbstractFactoryPattern.categoria.direcao.DirecaoMoto;
import AbstractFactoryPattern.categoria.seguranca.Seguranca;
import AbstractFactoryPattern.categoria.seguranca.SegurancaMoto;
import AbstractFactoryPattern.fabrica.FabricaVeiculo;

public class FabricaMoto implements FabricaVeiculo {

    public Seguranca getSeguranca() {
        return new SegurancaMoto();
    }

    public Direcao getDirecao() {
        return new DirecaoMoto();
    }

}
