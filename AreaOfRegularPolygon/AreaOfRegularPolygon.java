import java.util.*;

public class AreaOfRegularPolygon{
  public static void main(String[] args) {
    System.out.println("Enter the number of sides:");
    Scanner scan=new Scanner(System.in);
    int number_of_sides=scan.nextInt();
    System.out.println("Enter the side:");
    double side=scan.nextDouble();
    double area=(number_of_sides*side*side)/(4*Math.tan(Math.PI/number_of_sides));
    System.out.println("The area of the polygon is "+area);
  }
}
