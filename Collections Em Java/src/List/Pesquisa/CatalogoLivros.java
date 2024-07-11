package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // Atributo

    private List<Livro> livrolist;

    public CatalogoLivros() { this.livrolist = new ArrayList<>(); } // Cria uma nova lista vazia.
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){ // Adiciona um livro na lista porém para ser adicionado solicita que ele tenha
        // titulo, autor e o seu ano de publicacao.
        livrolist.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>(); // Cria uma nova lista vazia para armazenar os livros selecionados por autor.
        if (!livrolist.isEmpty()) { // Aqui estamos dizendo o seguinte: Se lista de livros não estiver fazia não faça nada, porém se tiver vazia faça \/
            for (Livro l : livrolist) { // Aqui dizemos que para cada Livro na variavel l dentro do array livrolist
                if (l.getAutor().equalsIgnoreCase(autor)) { // Percorre os nomes dos autores e se for igual a um que ja esteja na lista ele ignora
                    livrosPorAutor.add(l); // adiciona na lista o nome do autor selecionado
                }
            }
        }
        return livrosPorAutor; // retorna a lista pesquisada por autor.
    }

    public List<Livro> pesquisarPorIntervaloAno( int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrolist.isEmpty()) {
            for (Livro l : livrolist){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) { // Aqui como não vamos percorre uma lista e sim pegar o primeiro livro encontrado por Titulo seguimos sem o list
        Livro livroPorTitulo = null; // Aqui criamos a variavel livroPorTitulo e deixamos a mesma vazia por enquanto.
        if(!livrolist.isEmpty()){ // se a lista não estiver vazia vamos fazer \/
            for(Livro l : livrolist) {  // Para (for) cada livro (l) dentro da livrolist
                if(l.getTitulo().equalsIgnoreCase(titulo)) { // Aqui ele puxa para a variavel o titulo e verifica se não é igual.
                    livroPorTitulo = l; // Adiciona o livro encontrado pelo titulo a variavel
                    break; // Interrompe o laço pois ja foi localizado o livro pelo titulo
                }
            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1" , 2021);   
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2" , 2020);   
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2" , 2022);   
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3" , 2023);   
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4" , 1994);   
        
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(2020, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 1"));
        
    }
}
