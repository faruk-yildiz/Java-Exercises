import java.util.*;

public class SumDigitsOfInteger {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter an integer");
    int num=scan.nextInt();
    System.out.println("Sum of digits="+ sumDigits(num));
  }
  public static int sumDigits(int n)
  {
    int sumOfDigits=0;
      while(n!=0)
      {
        sumOfDigits=sumOfDigits+(n%10);
        n=n/10;
      }
      return sumOfDigits;
  }
}
