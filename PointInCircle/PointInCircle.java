import java.util.*;

public class PointInCircle{
  public static void main(String[] args) {
    System.out.println("The circle is centered at (0,0) with radius 10.Enter a point with two coordinates:");
    Scanner scan=new Scanner(System.in);
    double x=scan.nextDouble();
    double y=scan.nextDouble();
    double distance=Math.sqrt(Math.pow(x-0, 2)+Math.pow(y-0, 2));
    if(distance<=10)
      System.out.printf("Point (%.1f , %.1f) is in the circle",x,y);
    else
      System.out.printf("Point (%.1f , %.1f) is not in the circle",x,y);
  }
}
