package Publicacao;

public class Filme extends Publicacao {

    private int minutos;

    public Filme() {
        super();
    }

    public Filme(Filme filme){
        super.clone();
        this.minutos = filme.getMinutos();
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    @Override
    public Filme clone() {
        return new Filme(this);
    }

    @Override
    public String toString() {
        return "Filme { " + autor + ", " + nome + " Minutos: " + minutos + "}";
    }

}
