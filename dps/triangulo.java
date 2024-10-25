import java.util.Scanner;

public class triangulo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x,y,z;
    boolean triangulo;

    System.out.println("Digite o Lado A do triangulo:");
    x = input.nextInt();
    System.out.println("Digite o Lado B do triangulo:");
    y = input.nextInt();
    System.out.println("Digite o Lado C do triangulo:");
    z = input.nextInt();

    triangulo = e_triangulo(x, y, z);
    if (triangulo == true){
      System.out.println("É Triangulo!");
    }else{
      System.out.println("Não é Triangulo!");
    }
    tipo_triangulo(x, y, z);
    input.close();

  }
  public static boolean e_triangulo(int a,int b,int c){
    if((a<b+c)&&(b<a+c)&&(c<a+b)){
      return true;
    }else{
      return false;
    }
  }
  public static void tipo_triangulo(int a,int b,int c){
    if((a==b)&&(b==c)){
      System.out.println("É Equilatero");
    }else{
      if ((a==b)||(b==c)||(a==c)) {
        System.out.println("É Issoceles");
      }else{
        System.out.println("É Escaleno");
      }
    }
  }
}
