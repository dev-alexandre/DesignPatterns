package builder.construtores;

import builder.construcoes.CasaPopular;
import builder.opcionais.construcoes.Churraqueira;
import builder.opcionais.construcoes.Escritorio;
import builder.opcionais.construcoes.Piscina;
import builder.opcionais.construcoes.Varanda;
import builder.opcionais.variacoes.Azuleijo;
import builder.opcionais.variacoes.Decoracao;
import builder.opcionais.variacoes.Estilo;
import builder.opcionais.variacoes.Material;

public class BuilderCasaPopular implements Builder {

    private Churraqueira churraqueira;
    private Escritorio escritorio;
    private Piscina piscina;
    private Varanda varanda;

    @Override
    public void setChurrasqueira(Material material) {
        this.churraqueira = new Churraqueira(material);
    }

    @Override
    public void setEscritorio(Decoracao decoracao) {
        this.escritorio = new Escritorio(decoracao);
    }

    @Override
    public void setPiscina(Azuleijo azuleiro, Decoracao decoracao) {
        this.piscina = new Piscina(azuleiro, decoracao);
    }

    @Override
    public void setVaranda(Estilo estilo) {
        this.varanda = new Varanda(estilo);
    }


    public CasaPopular getConstruir() {
        return new CasaPopular(churraqueira, escritorio, piscina, varanda);
    }
}
