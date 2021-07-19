import java.util.*;

public class CostOfShipping{
  public static void main(String[] args) {
    System.out.println("Enter the weight of the package:");
    Scanner scan=new Scanner(System.in);
    double weight=scan.nextDouble();
    if(weight<=0)
      System.out.println("Invalid input");
    else if(weight>20)
      System.out.println("The package cannot be shipped");
    else
    {
      if(weight>0 && weight<=1)
        System.out.println("The cost of shipping is $3.5");
      else if(weight>1 && weight<=3)
        System.out.println("The cost of shipping is $5.5");
      else if(weight>3 && weight<=10)
        System.out.println("The cost of shipping is $8.5");
      else
        System.out.println("The cost of shipping is $10.5");

    }
  }
}
