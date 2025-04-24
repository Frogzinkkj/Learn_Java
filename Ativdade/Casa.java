package Ativdade;

public class Casa extends Construcao {

    /* nesse metodo construtor da classe, que tem um parametro
     * dentro dos parenteses
     */
    
    public Casa(double valor) {/*  é comum com a classe pai*/
        super(valor);/* aqui é o pulo do gato, a gente prede pra 
        classe pai, inicilizar esse atributo que estamos passando
        dentro do parenteses */
    }
  

    /* o override, ele serve para subescrever um metodo que 
    ja existe na classe pai, o java chama ele, e a gente implementa
    com que for necessario, nao podemos implementar na classe pai
    pois ela é abstrata 
      na atividade,caqui a gente subescreveu e implementou */
    @Override
    public double aluguel() {
        return (valor*0.10);
    }
  
}
