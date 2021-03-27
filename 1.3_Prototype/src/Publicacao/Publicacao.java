package Publicacao;

public class Publicacao {

    public String autor;
    public String nome;
    public int ano;

    public Publicacao() {
    }

    public Publicacao(Publicacao publicao){
        this.autor = publicao.getAutor();
        this.nome = publicao.getNome();
        this.ano = publicao.getAno();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    protected Publicacao clone()  {
        return new Publicacao(this);
    }
}
