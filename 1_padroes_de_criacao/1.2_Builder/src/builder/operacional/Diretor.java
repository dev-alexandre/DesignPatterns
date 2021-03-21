package builder.operacional;

import builder.construtores.Builder;
import builder.opcionais.variacoes.Estilo;
import builder.opcionais.variacoes.Material;

public class Diretor {

    public void construirCasaModeloUm(Builder builder) {
        builder.setChurrasqueira(Material.METAL);
        builder.setVaranda(Estilo.ESPACOSA);
    }

}