import java.util.Scanner;
public class prova2 {
    public static void main(String[] args) {
        /*Segundo Pitágoras, a potência de grau 2 pode ser calculada a partir da soma de números ímpares. Desta forma n^2 pode ser calculada somando os n primeiros números ímpares.

Exemplo: 5^2 = 1 + 3 + 5 + 7 + 9 = 25 

Faça um programa em Java que receba um número, referente à base de uma potência de segundo grau, calcule a potência usando o método de Pitágoras de somas de ímpares e informe o resultado. */
        Scanner input = new Scanner(System.in);
        int n; 
        int soma = 0;
        int contador = 1;
        
        System.out.println("Digite a base de uma potencia de segundo grau: ");
        n = input.nextInt();
          for(int i = 1; contador <= n; i++){
            if(i % 2 != 0){
                soma += i;
                contador++;
            }
        }
        System.out.println("O resultado da potencia de segundo grau é: " + soma);
        input.close();
    }
  
}
