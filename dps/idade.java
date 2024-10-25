package dps;
import java.util.Scanner;

public class idade{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int idade;

    System.out.println("Digite sua idade");
    idade = input.nextInt();
    verifica(idade);
    input.close();
  }
  public static void verifica (int a){
    if (a <=15){
      System.out.println("Voce nao pode votar");

    }
    else{
      if((a >= 18) && (a <= 64)){
        System.out.println("Voto obrigatorio");
      }
      else{
        System.out.println("Voto facultativo");
      }
    }
    
  }
}