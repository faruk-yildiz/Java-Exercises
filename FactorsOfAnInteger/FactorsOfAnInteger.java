import java.util.*;

public class FactorsOfAnInteger {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter an integer");
    int number=scan.nextInt();
    int divisor=2;
    while (number!=1) {
      if(number%divisor==0){
        System.out.print(divisor+" ");
        number=number/divisor;
      }
      else
        divisor++;
    }
  }
}
