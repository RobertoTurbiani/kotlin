package biblioteca

fun main() {
    val livraria = Livraria()

    val livro1 = Livro("O Senhor dos Anéis", "J.R.R. Tolkien")
    val livro2 = Livro("1984", "George Orwell")
    val livro3 = Livro("Moby Dick", "Herman Melville")

    livraria.adicionarLivro(livro1)
    livraria.adicionarLivro(livro2)
    livraria.adicionarLivro(livro3)

    val livros = livraria.listarLivros()
    for (livro in livros) {
        println("Título: ${livro.titulo}, Autor: ${livro.autor}")
    }

    livraria.removerlivro(livro2)
    for (livro in livros) {
        println("Título: ${livro.titulo}, Autor: ${livro.autor}")
    }


}