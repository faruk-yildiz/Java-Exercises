import java.util.*;

public class PalindromeInteger {
  public static void main(String[] args) {
    System.out.println("Enter an integer");
    Scanner scan=new Scanner(System.in);
    int number=scan.nextInt();
    System.out.println(number+" is Palindrome?="+isPalindrome(number));
  }

  public static boolean isPalindrome(int number)
  {
    if(number==reverse(number))
      return true;
    else
      return false;
  }
  public static int reverse(int n)
  {
    String s1=""+n;
    String s2="";
    for(int i=0;i<s1.length();i++)
    {
      s2+=s1.charAt(s1.length()-i-1);
    }
    return Integer.parseInt(s2);
  }
}
