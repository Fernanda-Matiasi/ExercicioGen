
fun main() {
    /*
    Informar todos os números de 1000 a 1999 que
    quando divididos por 11 obtemos resto = 5. (FOR)
     */
    val num = 0
    for(num in 1000 .. 1999){

        if(num%11== 5){
            println("Apenas estes números possuem o resto esperado: " +
                    "$num = ${num%11}")
        }
    }
}