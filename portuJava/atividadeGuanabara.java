import java.util.Scanner;

public class atividadeGuanabara{

    public static void main(String[] args) {
        int  numero;
        Scanner input=new Scanner(System.in);
        int soma=0;
        int somapares=0;
        int quant=0;
        int nulos=0;
        int media=0;
        for(int contador=1;contador<=5;contador++){
            System.out.println("digite um numero");
            numero=input.nextInt();
            if(numero%5==0){
                quant=quant+1;
            }
            if(numero==0){
                nulos=nulos+1;
            }
            if(numero%2==0){
                somapares=somapares+numero;

            }
            soma=soma+numero;
            media=soma/5;
        }
        System.out.println("A soma dos numeros é de "+soma+
        "\n A media entre"+media+
         "\nA quantidade de numeros divisiveis por 5 é"+quant+" a quantidade de soma pares"+somapares);
        input.close();
    }
}