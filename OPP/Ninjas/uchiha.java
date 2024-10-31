package OPP;

public class uchiha extends Ninjat1 {

  String tomoe;

  public void Sharingan(){
    System.out.println(getNome() + " Tem Sharingan");
    
  }

  @Override
  public void ataqueBase(){
    System.out.println("Usei uma Kunai de FOGO!");
  }
  public void ataqueBase(int nivelDeChackra){
    if(nivelDeChackra>2){
      System.out.println("Susano Ativado");
    }else if(nivelDeChackra==1){
      System.out.println("Apenas ativel Sharingan");
    }else{
      System.out.println("Estou Sem Chackra!");
    }
    
  }


}