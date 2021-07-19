import java.util.*;

public class QuadraticEquations{
  public static void main(String[] args) {
    System.out.println("Enter a,b,c :");
    Scanner scan=new Scanner(System.in);
    double a=scan.nextDouble();
    double b=scan.nextDouble();
    double c=scan.nextDouble();
    double discriminant=(b*b)-(4*a*c);

    if(discriminant>0)
    {
      double root1=(-b+Math.sqrt(discriminant))/(2*a);
      double root2=(-b-Math.sqrt(discriminant))/(2*a);
      System.out.println("The equation has two roots "+root1+" and "+root2);
    }
    else if(discriminant==0)
    {
      double root3=-b/(2*a);
      System.out.println("The equation has one root "+root3);
    }
    else
    System.out.println("The equation has no real roots");
  }
}
