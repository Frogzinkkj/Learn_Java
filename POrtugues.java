import java.util.Scanner;
public class POrtugues extends Disciplina{

    Scanner scanner=new Scanner (System.in);
    public POrtugues(double media) {
        super(media);
        double nota,contador;
        for(contador=0;contador<=4;contador++){
            System.out.println("o valor da nota");
            nota=scanner.nextDouble();

        }
        
    }

    @Override
    public double media() {
        return media;
        

    
}

    @Override
    public String professor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'professor'");
    }
}