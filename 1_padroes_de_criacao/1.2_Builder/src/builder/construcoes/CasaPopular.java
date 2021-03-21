package builder.construcoes;

import builder.opcionais.construcoes.Churraqueira;
import builder.opcionais.construcoes.Escritorio;
import builder.opcionais.construcoes.Piscina;
import builder.opcionais.construcoes.Varanda;

public class CasaPopular {

    private Churraqueira churraqueira;
    private Escritorio escritorio;
    private Piscina piscina;
    private Varanda varanda;

    public CasaPopular(Churraqueira churraqueira, Escritorio escritorio, Piscina piscina, Varanda varanda) {
        this.churraqueira = churraqueira;
        this.escritorio = escritorio;
        this.piscina = piscina;
        this.varanda = varanda;
    }

    public void apresentar() {
        System.out.println(
            "Essa " + this.getClass().getSimpleName() + " tem os seguintes atributos: " +
                "\n" +  "Churrasqueira: " + (churraqueira == null ? "Não possui" : churraqueira.getMaterial() ) +
                "\n" + "Escritorio: " +  (escritorio == null ? "Não possui" : escritorio.getDecoracao()) +
                "\n" + "Piscina: " +  (piscina == null ? "Não possui" : ("Decoração: " + piscina.getDecoracao() +
                    " ,Azuleijo: " + piscina.getAzuleijo()) ) +
                "\n" + "Varanda: " +  (varanda == null ? "Não possui" : varanda.getEstilo())
        );
    }
}
