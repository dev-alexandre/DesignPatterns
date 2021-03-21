package builder.opcionais.construcoes;

import builder.opcionais.variacoes.Decoracao;

public class Escritorio {

    private Decoracao decoracao;

    public Escritorio(Decoracao decoracao) {
        this.decoracao = decoracao;
    }

    public Decoracao getDecoracao() {
        return decoracao;
    }

    public void setDecoracao(Decoracao decoracao) {
        this.decoracao = decoracao;
    }
}
