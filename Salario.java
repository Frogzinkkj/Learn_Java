

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		double salarioMinimo,salario;
		System.out.println("digite o valor do seu salario minimo");
		salarioMinimo=ler.nextDouble();
		System.out.println("digite o valor do salario");
		salario=ler.nextDouble();
		System.out.println("A pessoa ganha "+salario/salarioMinimo+" salarios minimos");
		ler.close();

	}

}
