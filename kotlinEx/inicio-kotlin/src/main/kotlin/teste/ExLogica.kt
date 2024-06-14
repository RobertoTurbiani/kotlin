package teste

fun main(args: Array<String>) {

    println("Digite o seu nome")
    val nome = readLine()?: "ERRO";

    println("Digite a sua idade")
    val idade = readLine()?.toIntOrNull()?: 0;

    println("Digite o seu salário")
    val salario = readLine()?.toDoubleOrNull()?: 0.0;

    if (nome.isBlank()){
        println("Olá sem nome");
    } else if (idade <= 0){
        println("Parece que você ainda nem nasceu né");
    } else if (salario <= 0){
        println("Tá mais quebrado que eu");
    } else{


        println(nome)
        println(idade)
        println(salario)

    }

}