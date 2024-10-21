package list_6;
import java.util.Scanner;
public class l6q3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x;
    System.out.println("Digite um numero");
    x = input.nextInt();
    System.out.println(fibonacci(x));
    input.close();
  }
  public static int fibonacci(int y){
    int a =1 ,b=1 ,c=0;
    if(y == 1){
      y=1;
    }else{
      if (y==2){
        y=1;
      }else{
        for (int i = 3; i <= y; i++){
          c = a + b;
          a=b;
          b=c;
        }
      }
    }
    
    return c;
  }
}
