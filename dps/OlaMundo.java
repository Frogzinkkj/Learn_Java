package dps;


import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		String nome;
		System.out.println("Oi, sou computaria, qual seu nome?");
		nome=ler.nextLine();
		System.out.println("que nome lindo!"+nome);
		ler.close();
		
	

	}

}
