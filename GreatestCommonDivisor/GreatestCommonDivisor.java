import java.util.*;

public class GreatestCommonDivisor {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter two integer");
    int int1=scan.nextInt();
    int int2=scan.nextInt();
    int gcd=1;
    for (int i=1;i<=int1 && i<=int2 ;i++ ) {
      if(int1%i==0 && int2%i==0)
        gcd=i;
    }
    System.out.printf("Gcd of %d and %d is %d ",int1,int2,gcd);
  }
}
