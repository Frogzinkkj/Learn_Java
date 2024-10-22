package list_6;
import java.util.Scanner;
public class l6q4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char respo;
    int tabu;

    System.out.println("Vc deseja ver uma tabuada?");
    respo = input.next().charAt(0);

    while ((respo != 'n') && (respo == 's')) {
      System.out.println("Qual o numero da tabuada?");
      tabu = input.nextInt();
      tabuada(tabu);
      System.out.println();
      System.out.println("Vc deseja ver uma tabuada?");
      respo = input.next().charAt(0);
      System.out.println();
    }
    if((respo != 'n') && (respo != 's')){
      System.out.println("Resposta invalida!");
    }
    input.close();
  }
  public static int tabuada(int a){
    for(int i=1; i<=10; i++){
      System.out.println(a+"x"+i+"="+(a*i));
    }
    
    return a;
    
  }
}
