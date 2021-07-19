import java.util.*;

public class CalculateTips{
  public static void main(String[] args) {
    System.out.println("Enter a subtotal and gratuity rate");
    Scanner scan=new Scanner(System.in);
    double subtotal=scan.nextDouble();
    double gratuityRate=scan.nextDouble();
    double gratuity=(subtotal*gratuityRate)/100;
    double total=subtotal+gratuity;
    System.out.println("The gratuity is $"+gratuity+" and total is $"+total);
  }
}
