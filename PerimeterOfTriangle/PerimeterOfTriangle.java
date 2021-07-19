import java.util.*;

public class PerimeterOfTriangle{
  public static void main(String[] args) {
    System.out.println("Enter three sides of triangle:");
    Scanner scan=new Scanner(System.in);
    int sideA=scan.nextInt();
    int sideB=scan.nextInt();
    int sideC=scan.nextInt();
    int perimeter;
    if(sideA+sideB>sideC && sideA+sideC>sideB && sideB+sideC>sideA)
    {
      perimeter=sideA+sideB+sideC;
      System.out.println("Perimeter of triangle is "+perimeter);
    }
    else
      System.out.println("input is invalid");
  }
}
