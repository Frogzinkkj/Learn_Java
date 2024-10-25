

import java.util.Scanner;

public class NOTAS {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		double nota1,nota2,nota3,peso1,peso2,peso3,media;
		nota1=ler.nextDouble();
		nota2=ler.nextDouble();
		nota3=ler.nextDouble();
		peso1=ler.nextDouble();
		peso2=ler.nextDouble();
		peso3=ler.nextDouble();
		media=(nota1*peso1+nota2*peso2+nota3*peso3)/(peso1+peso2+peso3);
		System.out.println(media);
		ler.close();
		
				
		

	}

}
