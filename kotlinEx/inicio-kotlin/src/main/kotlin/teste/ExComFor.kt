package teste

fun main(args: Array<String>) {

    for (i in 1 until 20){

        println(i)
    }

    for (i in 1 ..20){

        println(i)
    }

    for (i in 20 downTo 1){

        println(i)
    }

    for (i in 1..20 step 3){

        println(i)
    }

    for (i in (1..5 step 2).reversed()) {
        println(i)
    }

    for (i in 1.rangeTo(10)) {
        println(i)
    }

}