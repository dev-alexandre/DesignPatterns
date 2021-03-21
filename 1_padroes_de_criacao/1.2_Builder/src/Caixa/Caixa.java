package Caixa;

public class Caixa {

    private int altura;
    private int largura;
    private Impressora impressora;

    public Caixa(int altura, int largura) {}
    public Caixa(int altura, int largura, Cor cor) { }
    public Caixa(int altura, int largura,  String Material) { }
    public Caixa(int altura, int largura, Cor cor, String Material, String Estilo) {}





    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public Impressora getImpressora() {
        return impressora;
    }
}
