

import java.util.Scanner;

public class gorjeta {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
	    double valor,valortotal;
		System.out.println("digite o valor gasto da conta");
		valor=ler.nextInt();
		valortotal=(valor*0.1)+valor;
		System.out.println("valor total com gorgeta"+valortotal);
		ler.close();

	}

}
