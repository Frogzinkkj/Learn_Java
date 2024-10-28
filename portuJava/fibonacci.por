programa {
  funcao inicio() {
    inteiro contador,n1,n2,n3
    n1=0
    n2=1
    escreva(n1,n2)

    para(contador=0;contador<15;contador++){
      n3=n1+n2
      n1=n2
      n2=n3
    
     escreva(n3)
    }

  }
}
