package Ativdade;

/* a class abestrata, nao pode ser solicitada 
diretamente com o new, ou seja criar um objeto dela 
ela serve somente para  ser herdada de outras classes */


	public abstract  class Construcao {
	  public int numeroComodos;
	  public float tamanhoCasa;
	  public String endereco;
	  protected double valor;
	  protected double aluguel;


	  
	  /* metodo constutor da classe, que passa como parametro 
	    a variavel , e atribui o valor desse atributo a uma 
	    variavel com o mesmo nome
	    ele serve para que consiga criar um objeto
	    ou subscrever nas minhas subclasses*/
	 
		public Construcao(double valor){ 
	    this.valor = valor; /*preenche o atributo com o valor 
		do parametro e isso serve para inicializar*/
	  }
	  	public Construcao(String endereco){
	    this.endereco = endereco;
	  }

]
0,
3
,0

	  /* metodo  abstrato (vazio, sem corpo)que precisara 
	  ser implementada nas sub classes  */
	  public abstract double aluguel();
	  

	  /* metodo concreto ja implementada, as classes filhas 
	   * podem usa-las , por que vao herdar dessa classe
	   * e nao precisa subrescrever */
	  	public void descrever (){
	    System.out.println("Tamanho da casa :" + tamanhoCasa);
	    System.out.println("Numero de comodos :" + numeroComodos);
	    System.out.println("Endereço: "+ endereco);
	    System.out.println("Valor da casa:"+ valor);
	    System.out.println("Possivel Aluguel da casa: "+ aluguel);
	  }




	    
	}
	
