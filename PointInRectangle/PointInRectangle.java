import java.util.*;

public class PointInRectangle{
  public static void main(String[] args) {
    System.out.println("The rectangle is centered at (0,0) with width 10 and height 5.Enter a point (x,y):");
    Scanner scan=new Scanner(System.in);
    double x=scan.nextDouble();
    double y=scan.nextDouble();
    double distanceX=Math.sqrt(Math.pow(x-0, 2));
    double distanceY=Math.sqrt(Math.pow(y-0, 2));
    if(distanceX<=5 && distanceY<=2.5)
      System.out.printf("Point (%.2f,%.2f) is in the rectangle",x,y);
    else
      System.out.println("Point is not in the rectangle");

  }
}
