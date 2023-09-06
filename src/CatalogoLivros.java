import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno( int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        catalogoLivros.adicionarLivro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        catalogoLivros.adicionarLivro("Harry Potter", "J. K. Rowling", 1997);
        catalogoLivros.adicionarLivro("Harry Potter", "J. K. Rowling", 1998);
        catalogoLivros.adicionarLivro("Harry Potter", "J. K. Rowling", 1999);
        catalogoLivros.adicionarLivro("Harry Potter", "J. K. Rowling", 2000);

        System.out.println(catalogoLivros.pesquisarPorAutor("J. K. Rowling"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(1990, 1999));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Harry Potter"));
    }
}
