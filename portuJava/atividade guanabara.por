programa {
  funcao inicio() {
    inteiro ,numero, soma,media,quant,nulos,somapares
    soma=0
    nulos=0
    quant=0
    somapares=0
    para(int contador=1;contador<=5;contador++){
    escreva("digite um numero")
    leia(numero)
    se(numero%5==0){
      quant=quant+1
    }
    se(numero%2==0){
    nulos=nulos+1
    }
    se(numero%2==0){
      somapares=somapares+numero

    }
    soma=soma+numero
    media=soma/5
    }
    escreva("a soma dos numero é de ",soma,"e a media entre os numero é de", media,"numeros diviseveis por 5 ", quant,"nulos são de ",nulos,"e soma de pares é ", somapares)
    
  }
}
    
