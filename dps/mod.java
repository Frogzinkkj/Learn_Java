package dps;

import java.util.Scanner;

public class mod {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String nome;
    int nota1,nota2,nota3,nota4,qnt_aluno,media;
    int cot=1;
    
    System.out.println("Digite a quantidade de Alunos da Sala: ");
    qnt_aluno = input.nextInt();

    while (cot<=qnt_aluno) {
          
      System.out.println("Digite o nome do aluno"+cot);
      input.nextLine();
      nome = input.nextLine();
      System.out.println("Digite a Primeira nota: ");
      nota1 = input.nextInt();
      System.out.println("Digite a Segunda nota: ");
      nota2 = input.nextInt();
      System.out.println("Digite a Terceira nota: ");
      nota3 = input.nextInt();
      System.out.println("Digite a Quarta nota: ");
      nota4 = input.nextInt();
      cot ++;
      media = (nota1+nota2+nota3+nota4)/4;
      fato(nome, media);
    }
    input.close();
  }

  public static void fato(String nome , double md){
    System.out.println("Nome do Aluno: "+nome);
    System.out.println("Media do Aluno "+md);
    if (md>=7) {
      System.out.println("Parabens, "+nome+" voce foi aprovado");


      
    } else {
      if (md<4) {
        System.out.println(nome+" voce nao alcançou a media minima");
        
      } else {
        System.out.println(nome+" ficou no meio");
        
      }
      
    }

  }
}