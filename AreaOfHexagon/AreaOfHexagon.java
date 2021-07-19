import java.util.*;

public class AreaOfHexaGon{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the length of the side:");
    double side=scan.nextDouble();
    double area=((3*Math.sqrt(3))/2)*Math.pow(side, 2);
    System.out.printf("The area of the hexagon is %.2f",area);
  }
}
