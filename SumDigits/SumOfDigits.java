import java.util.*;

public class SumOfDigits{
  public static void main(String[] args) {
    System.out.println("Enter a number between 0 and 1000");
    Scanner scan=new Scanner(System.in);
    int number=scan.nextInt();
    int firstDigit=number/100;
    number=number%100;
    int secondDigit=number/10;
    number=number%10;
    int thirdDigit=number/1;
    int sumOfDigits=firstDigit+secondDigit+thirdDigit;
    System.out.println("The sum of the digits "+sumOfDigits);
  }
}
