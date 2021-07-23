
public class PalindromicPrime {
  public static void main(String[] args) {
    int counter=0;
    int i=2;
    int numbersPerLine=0;
    while(counter!=100)
    {
      if(counter%10==0)
      {
        if(isPalindromicPrime(i))
        {
          System.out.printf("\n%7d",i);
          i++;
          counter++;
        }
        else
          i++;
      }
      else
      {
        if(isPalindromicPrime(i))
        {
          System.out.printf("%7d",i);
          counter++;
        }
        i++;
      }
    }

  }
  public static boolean isPalindromicPrime(int number)
  {
    if(isPrime(number))
    {
      if(number==reverse(number)&&isPrime(reverse(number)))
        return true;
      else
        return false;
    }
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
  public static boolean isPrime(int number){
    for(int i=2;i<number;i++)
    {
      if(number%i==0)
        return false;
    }
    return true;
  }
}
