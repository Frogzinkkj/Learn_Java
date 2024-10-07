import java.util.Scanner;
public class prova {
    public static void main(String[] args) {
        /*Faça um programa em Java que receba 2 números positivos A e B, calcule e mostre na tela a soma dos múltiplos de A que sejam menores do que B.

Ex:  A=2  e  B=10   => 2+4+6+8 = 20

Obs.: Só é necessário mostrar na tela o resultado final da soma. */
        Scanner input = new Scanner(System.in);
        int A,B;
        int soma = 0;
        System.out.println("Digite o valor de A: ");
        A = input.nextInt();
        System.out.println("Digite o valor de B: ");
        B = input.nextInt();
        for(int i = 0; i < B; i++){
            if(i % A == 0){
                soma += i;
            }
        }
        System.out.println("A soma dos múltiplos de A que são menores que B é: " + soma);

}
}