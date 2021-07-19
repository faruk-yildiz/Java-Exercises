import java.util.*;

public class AreaOfHexagon2{
  public static void main(String[] args) {
    System.out.println("Enter the side:");
    Scanner scan=new Scanner(System.in);
    double side=scan.nextDouble();
    double area=(6*side*side)/(4*Math.tan(Math.PI/6));
    System.out.printf("The area of the hexagon is %.2f",area);
  }
}
