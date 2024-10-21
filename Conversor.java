

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		float celsius,f;
		System.out.println("Escreva os graus celsius");
		celsius = input.nextFloat();
		f = ((9*celsius)+160)/5;
		System.out.println("°F = "+f);
		input.close();
	}
	

}
