package biblioteca

class Livraria {
    private val livros = mutableListOf<Livro>()

    fun adicionarLivro(livro: Livro) {
        livros.add(livro)
    }

    fun removerlivro(livro: Livro){
        livros.remove(livro)
    }

    fun listarLivros(): List<Livro> {
        return livros
    }
}