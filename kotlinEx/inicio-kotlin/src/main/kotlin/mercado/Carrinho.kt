package mercado

class Carrinho {
    private val produtos = mutableListOf<Produto>()


    fun adicioanarProduto(produto:Produto){
        produtos.add(produto);
    }

    fun removerProduto(produto: Produto){
        produtos.remove(produto);
    }

    fun listarProduto(): List<Produto>{
        return produtos;
    }
}