package matriz;

import  java.util.Scanner;

public class SMatQ1 {
  public static void main(String[] args) {

    int[][] num;
    num = preenche();
    mostra(num);
  }

  public static int[][] preenche() {
    int i, j;
    int[][] m = new int[2][2];
    Scanner scan = new Scanner(System.in);

    for(i=0; i<m.length; i++) {
      for(j=0; j<m[i].length; j++) {
       System.out.println(i + ", "+j+":");
      m[i][j] = scan. nextInt();
    }
  }
}

  public static void mostra(int[][] m) {

    int i, j;
    for(i=0; i<m.length; i++) {
      for(j=0; j<m[i].length; j++) {
        System.out.print(m[i][j] + " ");
      }
    System.out.println();
    }

    }
}
