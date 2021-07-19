import java.util.*;

public class AreaOfTriangle{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3:");
    double x1=scan.nextDouble();
    double y1=scan.nextDouble();
    double x2=scan.nextDouble();
    double y2=scan.nextDouble();
    double x3=scan.nextDouble();
    double y3=scan.nextDouble();

    double area=Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2);
    System.out.printf("The area of the triangle is %.2f",area);

  }
}
