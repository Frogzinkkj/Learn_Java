
public class fibonnaci {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
         
        System.out.println(n1);
        System.out.println(n2);
        for(int contador=1;contador<=15;contador++){
           int n3=n1+n2;
           n1=n2;
           n2=n3;
        System.out.println(n3);
        }
        
        
        
    }
    

}
