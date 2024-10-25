package dps;



import java.util.Scanner;

public class progressao {

	public static void main(String[] args) {
	
		Scanner ler=new Scanner(System.in);
		int termo1,termo2,proximoTermo,razao,n;
		System.out.println("digite o termo 1");
		termo1=ler.nextInt();
		System.out.println("digite o termo 2");
		termo2=ler.nextInt();
		System.out.println("digite qual o termo voce, meu lindo, deseja saber");
		proximoTermo = ler.nextInt();
		razao=termo2-termo1;
		n=termo1+(proximoTermo-1)*razao;
		System.out.println("o proximo termo é "+n);
		ler.close();
	}

}
