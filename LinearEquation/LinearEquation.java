import java.util.*;

public class LinearEquation{
  public static void main(String[] args) {
    System.out.println("Enter a,b,c,d,e,f");
    Scanner scan=new Scanner(System.in);
    double a=scan.nextDouble();
    double b=scan.nextDouble();
    double c=scan.nextDouble();
    double d=scan.nextDouble();
    double e=scan.nextDouble();
    double f=scan.nextDouble();

    if ((a*d)-(b*c)==0)
    {
      System.out.println("There is no solution");
    }
    else
    {
      double x=((e*d)-(b*f))/((a*d)-(b*c));
      double y=((a*f)-(e*c))/((a*d)-(b*c));
      System.out.printf("x is %.3f y is %.3f ",x,y);
    }
  }
}
