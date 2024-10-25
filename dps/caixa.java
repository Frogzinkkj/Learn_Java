

import java.util.Scanner;

public class caixa {

	public static void main(String[] args) {
		int n1, par;
		Scanner ler=new Scanner(System.in);
		System.out.println("digite um numero");
		n1=ler.nextInt();
		par=n1%2;
		if(par==0) {
			System.out.println("numero par");
			
		
		}else {
			System.out.println("numero impar");
		}
		if(n1>0) {
			System.out.println("numero positivo");
			
		}else{
			System.out.println("numero negativo");
			
			
		}
		ler.close();

			


				
		
		
				
	}

}
