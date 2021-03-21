package builder.opcionais.construcoes;

import builder.opcionais.variacoes.Estilo;

public class Varanda {

    private Estilo estilo;

    public Varanda(Estilo estilo) {
        this.estilo = estilo;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

}
