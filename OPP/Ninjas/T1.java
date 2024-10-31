package OPP;

public class T1 {
  public static void main(String[] args) {
    
    //obj 1
    Uzumaki naruto = new Uzumaki();
    naruto.setNome("Naruto Uzumaki");
    System.out.println(naruto.getNome());
    naruto.setIdade(16);
    naruto.getIdade();
    naruto.temBiju= true;
    naruto.ataqueBase();
    


    //obj 2
    uchiha sasuke = new uchiha();
    sasuke.setNome("Sasuke Uchiha");
    System.out.println("Meu nome é " + sasuke.getNome());
    sasuke.Sharingan();
    sasuke.ataqueBase();
    sasuke.ataqueBase(5);


  }
}
