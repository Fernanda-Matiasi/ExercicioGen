fun main() {
    /*
    Uma empresa desenvolveu uma pesquisa para saber as características
    psicológicas dos indivíduos de uma região. Para tanto, a cada uma
    das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino /
    3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa
    era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar
    um sistema que permita ler os dados de 150 pessoas, calcule e
    mostre: (WHILE)
* número de pessoas calmas;
* número de mulheres nervosas;
* número de homens agressivos;
* número de outros calmos;
* número de pessoas nervosas com mais de 40 anos;
* número de pessoas calmas com menos de 18 anos.
     */

    var cont = 0
    var idade = 0
    var sexo = 0
    var opc = 0

    var pCalmas = 0
    var mNer = 0
    var hAgr = 0
    var outCalmas = 0
    var nPNMa40 = 0
    var nPCMe18 = 0

    while (cont < 6){
        println("***Pessoa ${cont+1}***\n")

        print("Digite a idade: ")
        idade = readLine()!!.toInt()

        print("Digite seu sexo considerando 1) Feminino, 2)Masculino" +
                " 3)Para outro: ")
        sexo = readLine()!!.toInt()

        print("Qual o comportamento da pessoa, considerando 1)Calma, 2)Nervosa" +
                " 3)Agressiva: ")
        opc = readLine()!!.toInt()

        if (opc == 1){
            pCalmas++
        }

        if (sexo == 1 && opc == 2){
            mNer++
        }

        if (sexo == 2 && opc == 3){
            hAgr++
        }

        if (sexo == 3 && opc == 1){
            outCalmas++
        }

        if (opc == 2 && idade > 40){
            nPNMa40++
        }

        if (opc == 1 && idade < 18){
            nPCMe18++
        }
        cont++
    }
    println("O número de pessoas calmas é $pCalmas")
    println("O número de mulheres nervosas é $mNer")
    println("O número de homens agressivos é $hAgr")
    println("O número de outros calmas é $outCalmas")
    println("O número de pessoas nervosas com mais de 40 anos é $nPNMa40")
    println("O número de pessoas calmas com menos de 18 anos é $nPCMe18")
}