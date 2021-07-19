import java.util.*;

public class AreaOfPentagon{
  public static void main(String[] args) {
    System.out.println("Enter the length from the center to a vertex:");
    Scanner scan=new Scanner(System.in);
    double r=scan.nextDouble();
    double side=2*r*Math.sin(Math.PI/5);
    double area=(5*side*side)/(4*Math.tan(Math.PI/5));
    System.out.printf("The area of a pentagon is %.2f",area);
  }
}
