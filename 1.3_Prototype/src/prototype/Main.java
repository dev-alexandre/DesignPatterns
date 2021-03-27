package prototype;

import Publicacao.Livro;

public class Main {

    public static void main(String[] args) {

        Livro livroUm = new Livro();
            livroUm.setNome("Pedra Filosofal");
            livroUm.setAutor("J.K. Rowling");
            livroUm.setPaginas(223);

        Livro livroDois =  livroUm.clone();
            livroDois.setNome("Câmara Secreta");
            livroDois.setPaginas(252);

        System.out.println(livroUm);
        System.out.println(livroDois);

    }
}
