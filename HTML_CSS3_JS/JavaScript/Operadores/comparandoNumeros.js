function comparaNumeros( a, b){
    var soma = a + b;
    var simNao = "";
    var compararDez = "";
    var compararVinte = "";

    a == b ? simNao = "são" : simNao = "não são"
    soma > 10 ? compararDez = "maior" : compararDez = "menor"
    soma > 20 ? compararVinte = "maior" : compararVinte = "menor"
            
    return console.log(`Os números ${a} e ${b} ${simNao} iguais. Sua soma é ${soma}, que é ${compararDez} do que 10 e ${compararVinte} do que 20.`)
}

comparaNumeros(5,6);