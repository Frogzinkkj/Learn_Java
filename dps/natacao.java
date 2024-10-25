package dps;

import java.util.Scanner;
public class natacao {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int idade;
    idade = input.nextInt();
    idade(idade);
    input.close();
  }
  public static void idade(int a){
    if((a>5) && (a<7)){

    }else{
      if((a>=5) && (a<=7)){
        System.out.println("Infantil A");
      }else{
        if((a>=8) && (a<=10)){
          System.out.println("Infantil B");

        }else{
          if((a>=11) && (a<13)){
            System.out.println("Juvenil A");
          }else{
            if((a>=14) && (a<17)){
              System.out.println("Juvenil B");
            }else{
              System.out.println("Senior");
            }
          }
        }
      }
    }
  }
}
