package mercado

fun main(){
    val carrinho = Carrinho()

    val produto01 = Produto("Sabão",8.0,2);
    val produto02 = Produto("Batata",5.9,10);
    val produto03 = Produto("Arroz",23.0,4);

    carrinho.adicioanarProduto(produto01)
    carrinho.adicioanarProduto(produto02)
    carrinho.adicioanarProduto(produto03)

    val produtos = carrinho.listarProduto()

    for (produto in produtos ){
        println("Nome ${produto.nome}, Preço ${produto.preco}, Quantidade ${produto.quantidade}")
    }

    carrinho.removerProduto(produto01)
    for (produto in produtos ){
        println("Nome %s, preço %.2f, Quantidade %d".format(produto.nome, produto.preco, produto.quantidade))
    }

}