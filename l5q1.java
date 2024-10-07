import java.util.Scanner;

public class l5q1 {
  public static void main(String[] args) {
    /* Faça um programa que receba um número inteiro N e mostre na tela os N primeiros termos
    da sequência de Fibonacci (1, 1, 2, 3, 5, 8, 13 ...).F(n)=F(n−1)+F(n−2)*/
  Scanner input = new Scanner	(System.in);

    int n,fibo,fibo1=1,fibo2=1;

    
    System.out.println("Digite o termo de fibonacci:");
    n = input.nextInt();
    if ( n == 1) {
      System.out.println("1");
    }else{
      if(n == 2){
        System.out.println("1");
        System.out.println("1");
    }else{    
      for (int i = 3; i < n; i++){
        fibo = fibo1 + fibo2;
        System.out.println(fibo);
        fibo1=fibo2;
        fibo2=fibo;
    }}
  }
}}
