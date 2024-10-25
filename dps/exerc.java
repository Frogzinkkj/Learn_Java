package dps;



import java.util.Scanner;

public class exerc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fat,x;
        System.out.println("Digite um numero");
        x = input.nextInt();
        fat = 1;
        for(int i=1;i<=x;i++) {
        	fat *=i;	
        }
        System.out.println(fat);
        input.close();

    }
}