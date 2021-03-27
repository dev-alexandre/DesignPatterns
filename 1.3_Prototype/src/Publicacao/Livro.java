package Publicacao;

public class Livro{

    public String autor;
    public String nome;
    private int paginas;

    public Livro(){
    }
    //Novo construtor
    private Livro(Livro livro){
        this.autor = livro.getAutor();
        this.nome = livro.getNome();
        this.paginas = livro.getPaginas();
    }

    //Metodo de clone
    @Override
    public Livro clone()  {
        return new Livro(this);
    }

    /*Gettes e Setters*/
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
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                " autor='" + autor + '\'' +
                ", nome='" + nome + '\'' +
                ", paginas=" + paginas +
        '}';
    }
}

