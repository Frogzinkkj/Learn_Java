package dps;



import java.util.Scanner;

public class Tempo {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int horas,minutos,segundos,soma;
		System.out.println("digite que horas sao");
		horas=ler.nextInt();
		System.out.println("digite quantos minutos sao");
		minutos=ler.nextInt();
		System.out.println("digite quantos segundos sao");
		segundos=ler.nextInt();
		soma=(horas*3600)+(minutos*60)+segundos;
		System.out.println("sao "+soma);
		ler.close();
	}

}
