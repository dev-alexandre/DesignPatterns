package builder.opcionais.construcoes;

import builder.opcionais.variacoes.Azuleijo;
import builder.opcionais.variacoes.Decoracao;

public class Piscina {

    private Azuleijo azuleijo;
    private Decoracao decoracao;

    public Piscina(Azuleijo azuleijo, Decoracao decoracao) {
        this.azuleijo = azuleijo;
        this.decoracao = decoracao;
    }

    public Azuleijo getAzuleijo() {
        return azuleijo;
    }

    public void setAzuleijo(Azuleijo azuleijo) {
        this.azuleijo = azuleijo;
    }

    public Decoracao getDecoracao() {
        return decoracao;
    }

    public void setDecoracao(Decoracao decoracao) {
        this.decoracao = decoracao;
    }

}
