import java.util.Scanner;

public class Teste{
  public static void main(String[] args){
    int grade1,grade2,grade3,p_value1,p_value2,p_value3,final_grade;
    Scanner input = new Scanner(System.in);


    System.out.println("Enter the first grade: ");
    grade1 = input.nextInt();
    System.out.println("Enter the percentage value of the first grade:");
    p_value1 = input.nextInt();
    System.out.println("Enter the second grade:");
    grade2 = input.nextInt();
    System.out.println("Enter the percentage value of the second grade:");
    p_value2 = input.nextInt();
    System.out.println("Enter the third grade:");
    grade3 = input.nextInt();
    System.out.println("Enter the third percentage value of the third grade:");
    p_value3 = input.nextInt();
    final_grade = (grade1 * p_value1 + grade2 * p_value2 + grade3 * p_value3) / (p_value1+p_value2 + p_value3);
    System.out.println("Your Final grade is : " + final_grade);
    input.close();
}}