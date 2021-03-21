package builder.construtores;

import builder.opcionais.variacoes.Azuleijo;
import builder.opcionais.variacoes.Decoracao;
import builder.opcionais.variacoes.Estilo;
import builder.opcionais.variacoes.Material;

public interface Builder {

    void setChurrasqueira(Material material);
    void setEscritorio(Decoracao decoracao);
    void setPiscina(Azuleijo azuleiro, Decoracao decoracao);
    void setVaranda(Estilo estilo);

}
