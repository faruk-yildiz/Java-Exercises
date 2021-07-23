import java.util.*;

public class PalindromeInteger{
  public static void main(String[] args) {
    System.out.println("Enter a three-digit integer");
    Scanner scan=new Scanner(System.in);
    int number=scan.nextInt();
    int numberTemp=number;

    int firstDigit=number/100;
    number%=100;
    int secondDigit=number/10;
    number%=10;
    int thirdDigit=number;

    if(thirdDigit*100+secondDigit*10+firstDigit*1==numberTemp)
    System.out.printf("%d is palindrome",numberTemp);
    else
    System.out.printf("%d is not palindrome",numberTemp);
  }
}
