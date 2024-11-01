package OPP.Ninjas;

public class Ninjat1 {
  private String nome;
  private String aldeia;
  private int idade;    

  /*Getter - Criar getter apara mostrar para o User */

  public String getNome(){
    return nome;

  }
  public String getAldeia(){
    return aldeia;

  }
  public int getIdade(){
    return idade;

  }

  /*Setter - Settar valor da val */

  public void setNome(String nome){
    this.nome=nome;
  }
  public void setAldeia(String aldeia){
      this.aldeia=aldeia;
  }
  public void setIdade(int idade){
    this.idade = idade;
  }


  public void ataqueBase(){
    System.out.println("Usei uma Kunai");
  }

}
