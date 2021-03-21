package builder;

import builder.construtores.BuilderCasaDeLuxo;
import builder.operacional.Diretor;

public class Main {

    public static void main(String[] args){

        Diretor diretor = new Diretor();

        BuilderCasaDeLuxo builder = new BuilderCasaDeLuxo();
        diretor.construirCasaModeloUm(builder);

        builder.getConstruir().apresentar();

    }
}
