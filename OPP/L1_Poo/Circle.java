package OPP.L1_Poo;
/*Create a class called “Circle” that has an attribute to store the radius and methods to calculate the area and perimeter of the circle. */
import java.util.Scanner;

public class Circle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int radius;

    Display("Type the Circle Radius:");
    radius = input.nextInt();

    Display("Your Area is " + String.format("%2.f",Area(radius)) + "Your Perimeter is " + String.format("%2.f",Perimeter(radius)));
    
    input.close();


  }
  public static void Display(String message ){
    System.out.println(message);
  }
  /*The perimeter of a circle of radius r is calculated by C=2⋅π⋅r.
    The area of ​​a circle of radius r is given by A=π⋅r2. */
  public static double Area(double r){
    double area = 3.14*(r*r); 
    return area;
  }
  public static double Perimeter(double p){
    double perimeter;
    
    perimeter = 2*3.14*p;

    return perimeter;
  }
}
